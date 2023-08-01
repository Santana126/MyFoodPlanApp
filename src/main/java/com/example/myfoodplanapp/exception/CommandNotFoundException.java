package com.example.myfoodplanapp.exception;

public class CommandNotFoundException extends Exception{
    public CommandNotFoundException(String msg){
        super("\nCommand not found\nTry with: " + msg);
    }
}
