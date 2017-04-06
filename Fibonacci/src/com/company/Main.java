package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int angka = sc.nextInt();
        int x = 0;
        int y = 1;
        System.out.println("hasil: ");
        for(int i = 0; i < angka+1; i++){
            if (i != 0) {
                System.out.println(x + " ");
            }
            x = x + y;
            y = x - y;
        }
    }
}
