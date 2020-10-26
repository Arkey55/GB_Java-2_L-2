package ru.geekbrains.lesson_2.exceptions;

public class MyArrayErrorException extends RuntimeException {
    public MyArrayErrorException() {
    }

    public MyArrayErrorException(String message) {
        super(message);
    }

    public MyArrayErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
