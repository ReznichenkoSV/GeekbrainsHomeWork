package com.geekbrains.test.java1.lesson01.home01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        int[] myArr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив целых чисел [1 5 9 13 17 21 25 29 33 37]");

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = sc.nextInt();
        }

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 3 == 0) {
                System.out.printf("Элемент %d массива %s делится на 3 без остатка. %d*2=%d\n", i, Arrays.toString(myArr), myArr[i], myArr[i] * 2);
            }
        }

        int min = myArr[0], max = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < min) {
                min = myArr[i];
            }

            if (myArr[i] > max) {
                max = myArr[i];
            }
        }

        System.out.printf("Минимальный элемент массива %s равен: %d\n", Arrays.toString(myArr), min);
        System.out.printf("Максимальный элемент массива %s равен: %d\n", Arrays.toString(myArr), max);

    }
}
