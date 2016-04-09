package com.geekbrains.test.java1.lesson02.home01;

/**
 * Кот
 */
class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
        this.hungry = true;
    }

    @Override
    void eat(Plate plate) throws PlateIsEmpty {
        Food food = plate.getFood();
        if (food instanceof CatFood || food instanceof CombinedFood)
            if (food instanceof CombinedFood) {
                int eatCombinedFood = (int) (Math.random() * 2);

                if (eatCombinedFood == 0)
                    System.out.println(this.toString() + " мяу?");
                if (eatCombinedFood == 1) {
                    plate.setSize(5);

                    if (this.hungry) {
                        this.health += 2;

                        if (this.health >= 10)
                            this.hungry = false;
                    }

                    System.out.println(this.toString() + " -5?");
                }

            } else {
                plate.setSize(5);

                if (this.hungry) {
                    this.health += 3;

                    if (this.health >= 10)
                        this.hungry = false;
                }
                System.out.println(this.toString() + " -5?");
            }

        else
            System.out.println(this.toString() + " Фи!Мяу?");
    }

    @Override
    public String toString() {
        return "Cat " + this.name + "; health " + this.health + "; hungry " + this.hungry;
    }
}
