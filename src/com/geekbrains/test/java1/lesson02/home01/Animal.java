package com.geekbrains.test.java1.lesson02.home01;

/**
 * Животное
 */
abstract class Animal {
    String name;
    boolean hungry;
    int health;

    abstract void eat(Plate plate) throws PlateIsEmpty;

    public boolean isHungry() {
        return hungry;
    }
}
