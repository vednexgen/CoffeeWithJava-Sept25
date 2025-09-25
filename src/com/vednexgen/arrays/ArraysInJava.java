package com.vednexgen.arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysInJava {

    public static void main(String[] args) {
        int[] numbers;

        numbers = new int[5];

        IO.println("Initial numbers : " + Arrays.toString(numbers));

        IO.println(numbers[6]);

        IO.println("Number at 0 : " + numbers[2]);

        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 52;
        numbers[4] = 10;

        IO.println("Initial numbers : " + Arrays.toString(numbers));

        IO.println("Number : " + numbers[0]);
        IO.println("Number : " + numbers[2]);
        IO.println("Number : " + numbers[3]);

        // Using For Loop
        IO.println("Using For Loop");
        int[] arr = {11, 32, 31, 45, 52};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // array length = 5
        // indexing starts at 0
        // last index = 4 (array.length - 1)

        for (int i = 0; i < arr.length; i++) {
            IO.println(arr[i]);
        }

        IO.println("Using Enhanced For Loop");
        for (int num : arr) {
            System.out.println(num);
        }


        // Multi-Dimensional Arrays
        IO.println("Multi-Dimensional Arrays");
        int[][] matrix = {
                {1, 2, 3},  // 0
                {4, 5, 6},  // 1
                {7, 8, 9}   // 2
              // 0  1  2
        };


        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][0]);

        IO.println(matrix[0][1]); // Output: 2
        IO.println(matrix[2][2]); // Output: 9

        IO.println("Important Properties");
        IO.println(arr.length); // Output: 5

    }

}
