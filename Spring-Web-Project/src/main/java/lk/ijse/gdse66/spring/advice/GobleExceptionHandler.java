package lk.ijse.gdse66.spring.advice;


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

    }

    public Map<String,Object> getCommonErrorAttribute(HttpStatus status){
         LinkedHashMap<String,Object> errorAttributes = new LinkedHashMap<>();
         errorAttributes.put("code",status.value());
         errorAttributes.put("status",status);

         return errorAttributes;
    }
}
