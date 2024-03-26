package com.rodrigop13.web.exception;

public class UsernameUniqueViolationException extends RuntimeException{

    public UsernameUniqueViolationException(String message){
        super(message);
    }
    
}
