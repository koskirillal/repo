package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Cin Your string");
        String s = in.nextLine();
        char[] d =  s.toCharArray();
        System.out.println("Cin Your key");
        int key = in.nextInt();
        int f = 1;
        if (key <0){
            f = 0;
        }
        char[] s2 = new char [s.length()];
        for (int i = 0 ; i < s.length();i++){
            d[i] = (char) ((d[i] + key % 26));
            if (f == 1 && d[i] > 122){
                d[i] -= 26;
            }else if (f == 0 && d[i] < 97){
                d[i] +=26;
            }
        }
        System.out.println("This is Your string after Caesar's Cipher");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }
}