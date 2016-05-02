package com.f1reking.codewars;

import java.util.Arrays;

/**
 * Created by HuangYH on 2016/5/2.
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
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8};
        System.out.println(Arrays.toString(compoundArray(a,b)));
    }
}
