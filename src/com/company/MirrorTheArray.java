package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write code to flip array (7,2,9,4) -> (4,9,2,7). -
 * the array can be of arbitrary length. (When doing a task
 * additional array cannot be used)(1 hour)
 */
public class MirrorTheArray {

    public static void main(String[] args) {
        RandomArrayCreator randomArrayCreator = new RandomArrayCreator();

        int[] array = randomArrayCreator.randomArrayCreator();

        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                arrayFlipper(array, i);
            }
        } else
            for (int i = 0; i < (array.length - 1) / 2; i++) {
                arrayFlipper(array, i);
            }

        System.out.println(Arrays.toString(array));
    }

    public static void arrayFlipper(int[] array, int i) {
        int changeable;
        changeable = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - i - 1] = changeable;
    }


}


