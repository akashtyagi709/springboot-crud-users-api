package com.example.CRUD.CORE;

public class ApiResponse <T>{
    private String message;
    private boolean success;
    private  T data;

    public  ApiResponse(){}

    public  ApiResponse(String message, boolean success,T data){
        this.message=message;
        this.success=success;
        this.data=data;
    }

    public  String getMessage(){
        return  message;
    }
    public boolean getSuccess(){
        return  success;
    }
    public T getData(){
        return  data;
    }

    public void setMessage(String message){
        this.message=message;
    }

    public void setSuccess(boolean success){
        this.success=success;
    }
    public void setData(T data){
        this.data=data;
    }

}