package com.example.CRUD.EXCEPTIONHANDLERS;

import com.example.CRUD.CORE.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ApiResponse<String>> handleRuntimeException(RuntimeException runtimeException){
        String message="Something went Wrong";
        if (runtimeException.getMessage().contains("Duplicate entry")){
            message="Duplicate data Found";
        }
        ApiResponse<String> response = new ApiResponse<>(message,false,null);
        return ResponseEntity.status(400).body(response);
    }
}
