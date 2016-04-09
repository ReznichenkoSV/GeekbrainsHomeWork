package com.geekbrains.test.java0.lesson03.home01;

import java.util.Scanner;

/*
Класс Студент наследует Участник
Средний балл (float)

ввод значений при создании методом из класса (Scanner, исключения при выходе за пределы) - переопределение
Редактирование - методами класса (кидает свое исключение с сообщением об ошибке при неправильных параметрах) - переопределение
вывод (toString)
 */
class Student extends Member {
    float gpa;

    Student() {
    }

    @Override
    void add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Данные студента ");
        System.out.println("Введите имя: ");
        this.name = sc.nextLine();
        System.out.println("Введите возраст: ");
        this.age = sc.nextFloat();
        System.out.println("Введите средний балл: ");
        this.gpa = sc.nextFloat();
    }

    @Override
    void edit() {

    }

    @Override
    public String toString() {
        return null;
    }

}
