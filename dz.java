package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("n");
        int n=in.nextInt();
        int per1=1;
        int per2=0;
        int per3=0;
        for (int i=1;i<=n;i++){
            per3=per1;
            per1=per1+per2;
            per2=per3;
            System.out.println(per3);
        }
    }
}