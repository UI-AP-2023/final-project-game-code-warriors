package com.example.clashofclans.Exception;

public class InvalidEmailException extends InvalidInputException{
    public InvalidEmailException() {
        super("Invalid email address");
    }
}
