package com.rodrigop13.web.exception;

public class PasswordInvalidException extends RuntimeException{
    
    public PasswordInvalidException(String message){
        super(message);
    }
}
