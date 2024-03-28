package lk.ijse.gdse66.spring.advice;


import lk.ijse.gdse66.spring.service.exception.DuplicateRecordException;
import lk.ijse.gdse66.spring.service.exception.NotFoundException;
import lk.ijse.gdse66.spring.service.exception.ServiceExcption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GobleExceptionHandler {

    @ExceptionHandler(ServiceExcption.class)//only handler Services Exception
    public ResponseEntity<Map<String,Object>> handleServicesException(ServiceExcption exp){
        Map<String, Object> errorAttribute = null;
        if (exp instanceof DuplicateRecordException){
            getCommonErrorAttribute(HttpStatus.CONFLICT);
       }else if(exp instanceof NotFoundException){
           errorAttribute =getCommonErrorAttribute(HttpStatus.NOT_FOUND);
       }else{
            errorAttribute =getCommonErrorAttribute(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        errorAttribute.put("message",exp.getMessage());

        return new ResponseEntity<>(errorAttribute,HttpStatus.valueOf((Integer) errorAttribute.get("code")));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> handleDataValidationException(MethodArgumentNotValidException exp){
        Map<String,Object> errorAttribute = getCommonErrorAttribute(HttpStatus.BAD_REQUEST);
        ArrayList<Map<String,Object>> errorList = new ArrayList<>();

        for (FieldError fieldError : exp.getFieldErrors()){
            LinkedHashMap<String, Object> errorMap = new LinkedHashMap<>();
            errorMap.put("filed",fieldError.getField());
            errorMap.put("error",fieldError.getDefaultMessage());
            errorMap.put("rejected",fieldError.getRejectedValue());

            errorList.add(errorMap);
        }
        errorAttribute.put("massage","Data validation failed");
        errorAttribute.put("errors",errorList);

        return errorAttribute;
    }

    public Map<String,Object> getCommonErrorAttribute(HttpStatus status){
         LinkedHashMap<String,Object> errorAttributes = new LinkedHashMap<>();
         errorAttributes.put("code",status.value());
         errorAttributes.put("status",status);

         return errorAttributes;
    }
}
