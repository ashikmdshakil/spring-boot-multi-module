package org.ashik.exception.handler_config;

import org.ashik.exception.ArgumentNotValidException;
import org.ashik.exception.data.ErrorResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArgumentNotValidException.class)
    public ResponseEntity<?> argumentNotValidExceptionHandling(ArgumentNotValidException exception, WebRequest request){
        ErrorResponseData errorResponseData = new ErrorResponseData(exception.getMessage(), exception.getMessageCode());
        return new ResponseEntity<>(errorResponseData, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidExceptionHandling(MethodArgumentNotValidException exception, WebRequest request){
        ErrorResponseData errorResponseData = new ErrorResponseData(exception.getFieldError().getDefaultMessage(), "0");
        return new ResponseEntity<>(errorResponseData, HttpStatus.BAD_REQUEST);
    }
}
