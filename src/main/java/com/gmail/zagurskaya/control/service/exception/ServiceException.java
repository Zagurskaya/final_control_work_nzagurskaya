package com.gmail.zagurskaya.control.service.exception;

public class ServiceException extends RuntimeException {

    public ServiceException(String message, Exception e) {
        super(message, e);
    }
}
