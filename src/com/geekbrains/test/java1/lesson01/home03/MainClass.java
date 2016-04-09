package com.geekbrains.test.java1.lesson01.home03;

import java.util.Arrays;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        int[] mainArray = new int[]{5, 4, 4, 2, 2, 1, 6, 5, 6, 4, 8, 2, 3, 1};
        int[] patternArray = new int[]{1, 6, 5, 5};
        int[] patternArray1 = new int[]{4, 8, 2, 3, 1};

        System.out.printf("Массив %s содержит массив %s: %s\n", Arrays.toString(mainArray), Arrays.toString(patternArray), containArr(mainArray, patternArray));
        System.out.printf("Массив %s содержит массив %s: %s\n", Arrays.toString(mainArray), Arrays.toString(patternArray1), containArr(mainArray, patternArray1));
    }

    public static boolean containArr(int[] outer, int[] inner) {
        for (int i = 0; i < outer.length; i++) {
            int countContains = 0;
            for (int j = 0; j < inner.length; j++) {
                if (i + j < outer.length && outer[i + j] == inner[j]) {
                    countContains++;
                } else {
                    break;
                }
            }

            if (countContains == inner.length) {
                return true;
            }
        }
        return false;
    }
}
