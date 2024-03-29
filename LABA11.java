package com.company;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("S:\\Javalabs\\labvitalik.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File " + f.getName() + "? y/n");
        name = br.readLine();
        if (name.equals("y")) {
            while ((line = fin.readLine()) != null) {
                String[] words = line.split("(/\\*.+?\\*/)|(//.+.?)[:;A-Z a-z А-Я а-я Ё ё]*/");
                for (String word: words){
                    System.out.println(word);
                }
            }
        }
        else {
            System.out.println("RELOAD program.");
        }
    }
}
