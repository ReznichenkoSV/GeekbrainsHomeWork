package com.geekbrains.test.java1.lesson01.home02;

import java.util.Arrays;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        shiftArray(2);
        shiftArray(-3);
        shiftArray(-2);
    }

    public static void shiftArray(int n) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(arr));

        if (Math.signum(n) == 1.0) {
            moveRight(arr, n);
        } else {
            moveLeft(arr, n);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveRight(int[] arr, int shift) {
        int size = arr.length;
        int[] tmp = arr.clone();

        for (int i = 0; i < size; i++) {
            if (i + shift < size) {
                arr[i + shift] = tmp[i];
            } else {
                arr[i + shift - size] = tmp[i];
            }
        }
    }

    public static void moveLeft(int[] arr, int shift) {
        int size = arr.length;
        int[] tmp = arr.clone();

        for (int i = size - 1; i >= 0; i--) {
            if (i + shift >= 0) {
                arr[i + shift] = tmp[i];
            } else {
                arr[size + shift + i] = tmp[i];
            }
        }
    }
}
