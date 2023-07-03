package com.example.clashofclans.Exception;

public class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super("Invalid Input - "+message);
    }
}
