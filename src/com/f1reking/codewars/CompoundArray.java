package com.f1reking.codewars;

import java.util.Arrays;

/**
 * Created by F1ReKing on 2016/5/2.
 */

/**
 * Description:
 *
 * You have to create a method "compoundArray" which should take as input two int arrays of different *length and return one int array with numbers of both arrays shuffled one by one. Example: Input - *{1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}
 */
public class CompoundArray {

    public static int[] compoundArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) c[b.length + i] = a[i];
            else c[i * 2] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            if (i + 1 >= a.length) c[a.length + i] = b[i];
            else c[i + i + 1] = b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {9,8,7,6};
        System.out.println(Arrays.toString(compoundArray(a, b)));
    }
}
