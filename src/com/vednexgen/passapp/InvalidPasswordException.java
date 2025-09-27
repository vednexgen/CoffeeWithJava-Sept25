package com.vednexgen.passapp;

public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException(String msg) {
        super(msg);
    }

}
