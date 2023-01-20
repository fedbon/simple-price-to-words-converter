package ru.otus.api.services;

public interface Validator {
    default boolean validate (String value){
        return true;
    }
    default boolean validate (int value){
        return true;
    }
    String errorMessage();
}

