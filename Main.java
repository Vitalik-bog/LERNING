package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.println("Введите все элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min);

        int max = array[size - 1];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}