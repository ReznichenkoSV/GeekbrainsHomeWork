package com.geekbrains.test.java1.lesson02.home01;

/**
 * Исключение миска пуста
 */
class PlateIsEmpty extends Exception {
    public PlateIsEmpty(String message) {
        super(message);
    }
}
