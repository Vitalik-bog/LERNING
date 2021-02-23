package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input num1");
	int a = in.nextInt();
	System.out.println("Input num2");
	int b = in.nextInt();
	System.out.println("Input num3");
	int c = in.nextInt();
	System.out.println("Input num4");
	int d = in.nextInt();
	    if (a<0 && c!=0)
        {
            double fx=b*Math.pow(a,2)+c;
        }
	    else  if (a>0 && b==0)
        {
            double fx=(a-b)/(a-d);
        }
	else {
	    System.out.println(a);
        }
    }
}
