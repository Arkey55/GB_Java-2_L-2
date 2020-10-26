package ru.geekbrains.lesson_2.exceptions;

public class ErrorException extends RuntimeException {
    public ErrorException() {
    }

    public ErrorException(String message) {
        super(message);
    }

    public ErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
