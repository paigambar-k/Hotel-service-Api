package com.lcwd.hotel.exceptions;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String s){
        super(s);
    }

    public ResourceNotFoundException(){
        super("Resource not fpund !!");
    }
}
