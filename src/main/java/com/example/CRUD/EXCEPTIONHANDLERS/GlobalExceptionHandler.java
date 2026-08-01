package com.example.CRUD.EXCEPTIONHANDLERS;

import com.example.CRUD.CORE.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ApiResponse<String>> handleRuntimeException(RuntimeException runtimeException){

        runtimeException.printStackTrace();

        ApiResponse<String> response =
                new ApiResponse<>(runtimeException.getMessage(), false, null);

        return ResponseEntity.status(400).body(response);
    }
}