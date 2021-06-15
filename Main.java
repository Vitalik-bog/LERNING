package com.company;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter array length");
int a = in.nextInt();
int arrey[] = new int[a];
System.out.println("элемент массива");
for (int b = 0; b < a; b++) {
arrey[b] = in.nextInt();
}
int min = arrey[0];
for (int b = 0; b < a; b++) {
if (arrey[b] < min) {
min = arrey[b];
}
}
int sum = 0;
for (int b = 0; b < a; b++) {
sum = sum + arrey[b];
}
System.out.println(sum);
double num = sum / a;
double result = num * min;
System.out.println(result);
}


}
