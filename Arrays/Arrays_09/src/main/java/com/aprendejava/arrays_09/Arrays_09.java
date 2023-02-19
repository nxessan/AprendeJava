package com.aprendejava.arrays_09;

import java.util.Scanner;

/**
 * 9.Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra "par" o "impar" según proceda.
 *
 * @author noelia
 */
public class Arrays_09 {

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        int[] num = new int[8];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca el número " + (i + 1));
            num[i] = sC.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " par");
            } else {
                System.out.println(num[i] + " impar");
            }
        }
    }
}