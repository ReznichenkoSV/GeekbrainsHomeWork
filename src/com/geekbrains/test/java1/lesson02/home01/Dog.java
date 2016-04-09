package com.geekbrains.test.java1.lesson02.home01;

/**
 * Собака
 */
class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
        this.hungry = true;
    }

    @Override
    void eat(Plate plate) throws PlateIsEmpty {
        Food food = plate.getFood();

        if (food instanceof DogFood || food instanceof CombinedFood)
            if (food instanceof CombinedFood) {
                int eatCombinedFood = (int) (Math.random() * 2);

                if (eatCombinedFood == 0)
                    System.out.println(this.toString() + " гав?");
                if (eatCombinedFood == 1) {
                    plate.setSize(10);

                    if (this.hungry) {
                        this.health += 4;

                        if (this.health >= 20)
                            this.hungry = false;
                    }

                    System.out.println(this.toString() + " -10?");
                }
            } else {
                plate.setSize(10);

                if (this.hungry) {
                    this.health += 6;

                    if (this.health >= 20)
                        this.hungry = false;
                }

                System.out.println(this.toString() + " -10?");
            }
        else
            System.out.println(this.toString() + " Фу!Гав?");
    }

    @Override
    public String toString() {
        return "Dog " + this.name + "; health " + this.health + "; hungry " + this.hungry;
    }
}
