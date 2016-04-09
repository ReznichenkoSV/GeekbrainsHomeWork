package com.geekbrains.test.java1.lesson02.home01;

/*
Основная задача:
 Есть коты, собаки и миска с едой
 - в миске может быть 100 ед. еды.
 - могут кушать из одной миски с едой
 - в миске может находиться корм (кошачий, собачий, комбинированный, только один из них, можно при запуске случайно выбирать тип)
 Считаем что:
   - коты кушают корм(кошачий, комбинированный) 5 ед.
   - собаки(собачий и комбинированный) 10 ед
   - некоторые коты или собаки могут отказываться от комбинированного корма.
 В результате работы программы нужно сделать вывод в консоль сообщение о состоянии животных(не голодные/голодные), и количестве еды в тарелке.
 В тарелке определенное количество корма, последним животным корма может не хватить.
 Реализовывать необходимо все через ООП соответственно(Вы сами должны выбрать все необходимые классы).
 Количество животных выбираете сами.
Упрощенный вариант:
 Если задача кажется сложной, можете сделать упрощенный вариант. Есть коты и собаки, которые должны уметь кушать корм из тарелки,
 в результате работы программы вывести сообщение о количестве оставшегося корма.

 Весь код все также скидываем в один тхт файл
*/

import java.util.ArrayList;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class MainClass {

    public static void main(String[] args) {
        int i = (int) (Math.random() * 3);
        Food food = new Food();

        if (i == 0)
            food = new CombinedFood();
        if (i == 1)
            food = new CatFood();
        if (i == 2)
            food = new DogFood();


        Plate plate = new Plate(food, 100);

        System.out.println(plate);
        System.out.println();

        ArrayList<Animal> animals = new ArrayList<>();


        Cat cat1 = new Cat("Васька");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Матроскин");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);

        //100 предложим еду
        for (int j = 0; j < 100; j++) {

            try {
                int idxAnimal = (int) (Math.random() * animals.size());

                if (animals.get(idxAnimal).isHungry())
                    animals.get(idxAnimal).eat(plate);


            } catch (PlateIsEmpty e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("");
        System.out.println(plate);
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

}
