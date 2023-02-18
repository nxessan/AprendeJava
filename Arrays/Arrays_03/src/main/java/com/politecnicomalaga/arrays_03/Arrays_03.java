package com.politecnicomalaga.arrays_03;

import java.util.Scanner;

/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 *
 * @author noelia
 */
public class Arrays_03 {
    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);

        int [] numeros = new int [10];

        for (int i = 0; i <= 9; i++){
            System.out.println("Escribe el número " + (i+1));
            numeros [i] = sC.nextInt();
        }

        //Mostrar los valores del array en orden inverso
        for (int i = 9; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
}
