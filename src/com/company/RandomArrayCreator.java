package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArrayCreator {
    public int[] randomArrayCreator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array's length");
        int length = sc.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
