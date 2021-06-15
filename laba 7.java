
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = in.nextLine();
        String[] chAr = str1.split(" ");
        String meg = chAr[0];
        for (int i = 1; i < chAr.length; i++) {
            if (meg.length() < chAr[i].length()) ;
        }
        System.out.println(meg);

    }
}
