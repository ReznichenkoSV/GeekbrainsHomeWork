package com.geekbrains.test.java0.lesson03.home01;

import java.util.Scanner;

/*
Класс Препод наследует Участник
Количество полных лет стажа (int)

ввод значений при создании методом из класса (Scanner, исключения при выходе за пределы) - переопределение
Редактирование - методами класса (свое исключение с сообщением об ошибке при неправильных параметрах) - переопределение
вывод (toString)

В классе препод сделайте static подсчет экземпляров класса. И увеличивайте его на 1 при каждом создании экземпляра в конструкторе. И выводите при печати каждого объекта Препод.
*/
class Teacher extends Member {
    int experience;
    private static int count = 0;

    Teacher() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    void add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Данные студента ");
        System.out.println("Введите имя: ");
        this.name = sc.nextLine();
        System.out.println("Введите возраст: ");
        this.age = sc.nextFloat();
        System.out.println("Введите стаж: ");
        this.experience = sc.nextInt();
    }

    @Override
    void edit() {

    }

    @Override
    public String toString() {
        return "Кол-во экземпляров: " + count;
    }
}
