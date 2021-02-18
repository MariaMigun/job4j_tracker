package ru.job4j.ex;

public class UserInvalidExceprion extends UserNotFoundException{
    public UserInvalidExceprion(String message) {
        super(message);
    }
}
