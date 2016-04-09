package com.geekbrains.test.java0.lesson03.home01;

/*
Класс Участник
Имя
Возраст

реализация интерейса Comparable
Редактирование - абстрактный метод
ввод значений методом - абстрактный методом
*/
abstract class Member {
    String name;
    float age;

    abstract void add();

    abstract void edit();

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member)
            return ((Member) obj).name.equals(name);
        else
            return false;
    }

    @Override
    public abstract String toString();
}


