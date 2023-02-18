package com.politecnicomalaga.arrays_05;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 *
 * @author noelia
 */
public class Arrays_05 {

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);

        //Atributos
        int[] numeros = new int[10];
        int min = 999999999;
        int max = -999999999;

        //Pedir numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1));
            numeros[i] = sC.nextInt();

            //Comparar numeros
            if (numeros[i] < min) {
                min = numeros[i];
            }

            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        //Mostrar numeros
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == max) {
                System.out.print(" máximo");
            }
            if (numeros[i] == min) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
    }
}
