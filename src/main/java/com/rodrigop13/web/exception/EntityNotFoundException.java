package com.rodrigop13.web.exception;

public class EntityNotFoundException extends RuntimeException{
    
    public EntityNotFoundException(String message){
        super(message);
    }
    
}
