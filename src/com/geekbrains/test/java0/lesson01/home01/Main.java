package com.geekbrains.test.java0.lesson01.home01;

import java.util.Scanner;

public class Main {

    private static String task1_info = "Задача 1\n" +
            "1) объявляет массив размером 4 элемента типа int\n" +
            "2) выводит все значения на печать (циклом for)";

    private static String task2_info = "Задача 2 \n" +
            "1) программа считывает целое число N (объявляется переменная)\n" +
            "2) объявляет переменные sum и chislo типа int\n" +
            "3) затем считывает N раз значение в переменную chislo (поместите код считывания внутрь цикла) и суммирует эти значения в sum, но только если введенное значение больше 2\n" +
            "4) выводит сумму на печать";

    public static void main(String[] args) {
        int TaskNumber;
        TaskNumber = getIntNumber("Введите номер задания для выполнения: ");

        switch (TaskNumber) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            default:
                task1();
                task2();
                break;
        }
    }

    /**
     * Задание 1
     */
    public static void task1() {
        System.out.println(task1_info);

        int[] arr1 = {1, 2, 3, 10};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    /**
     * Задание 2
     */
    public static void task2() {
        System.out.print(task2_info + "\n\n");

        int cntNumbers = getIntNumber("Введите кол-во вводимых чисел: ");
        int chislo;
        int sum = 0;

        for (int i = 0; i < cntNumbers; i++) {
            chislo = getIntNumber("Введите целое число(" + (i + 1) + "): ");
            if (chislo > 2) {
                sum = sum + chislo;
            }
        }

        System.out.println("Сумма введенных чисел больших 2: " + sum);
    }

    /**
     * Получить целое число из потока ввода
     *
     * @param msg сообщение при вводе
     * @return int
     */
    public static int getIntNumber(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        if (!sc.hasNextInt()) {
            System.out.println("Неверный формат введенного числа. Должно быть целое число");
        }

        return sc.nextInt();
    }
}

