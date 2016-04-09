package com.geekbrains.test.java1.lesson02.home01;

/**
 * Миска
 */
class Plate {
    static int size = 0;
    Food food;

    public Plate(Food food, int size) {
        this.food = food;
        Plate.size = size;
    }

    public Food getFood() {
        return food;
    }

    public void setSize(int size) throws PlateIsEmpty {

        if (Plate.size - size < 0)
            throw new PlateIsEmpty("Еда закончилась!!!");
        else
            Plate.size -= size;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "size=" + size +
                ", food=" + food +
                '}';
    }
}
