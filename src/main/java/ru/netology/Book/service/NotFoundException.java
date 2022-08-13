package ru.netology.Book.service;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }

}
