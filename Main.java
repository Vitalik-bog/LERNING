package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.format("%.2f\n", Math.PI);
        System.out.println("Imput a number");
        double x = in.nextDouble();
        double arg1 = 3 * Math.PI - 2 * (x);
        double arg2 = 2 * Math.sin(arg1);
        double arg3 = 5 * Math.PI + 2 * (x);
        double arg4 = Math.pow (Math.cos(arg3),2);
        double z = arg2 * arg4 ;
        System.out.print(z);
        in.close();
    }
}