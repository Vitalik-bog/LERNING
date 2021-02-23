package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n ");
        int n = in.nextInt();
        double p = 0;
        if (n > 2) {
            for (int i = 2; i <= n; i++) {
                p = p + (1 - 1 / Math.pow(2, i));
            }
            System.out.print(p);
        } else {
            System.out.println("Error");
        }
    }}