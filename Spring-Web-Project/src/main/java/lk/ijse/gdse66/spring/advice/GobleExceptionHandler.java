package lk.ijse.gdse66.spring.advice;


import lk.ijse.gdse66.spring.service.exception.DuplicateRecordException;
import lk.ijse.gdse66.spring.service.exception.NotFoundException;
import lk.ijse.gdse66.spring.service.exception.ServiceExcption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GobleExceptionHandler {

    @ExceptionHandler(ServiceExcption.class)//only handler Services Exception
    public ResponseEntity<Map<String,Object>> handleServicesException(ServiceExcption exp){
        Map<String, Object> errorAttribute;
        if (exp instanceof DuplicateRecordException){
           errorAttribute = getCommonErrorAttribute(HttpStatus.CONFLICT);
       }else if(exp instanceof NotFoundException){
           errorAttribute =getCommonErrorAttribute(HttpStatus.NOT_FOUND);
       }else{
            errorAttribute =getCommonErrorAttribute(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        errorAttribute.put("message",exp.getMessage());

        return new ResponseEntity<>(errorAttribute,HttpStatus.valueOf((Integer) errorAttribute.get("code")));
    }

    public Map<String,Object> getCommonErrorAttribute(HttpStatus status){
         LinkedHashMap<String,Object> errorAttributes = new LinkedHashMap<>();
         errorAttributes.put("code",status.value());
         errorAttributes.put("status",status);

         return errorAttributes;
    }
}
