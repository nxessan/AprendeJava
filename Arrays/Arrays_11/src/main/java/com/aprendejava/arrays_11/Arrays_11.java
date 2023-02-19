package com.aprendejava.arrays_11;

import java.util.Random;
import java.util.Scanner;

/**
 * 11. Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice (0 – 9). Seguidamente el programa pasará los primos a las primeras
 * posiciones, desplazando el resto de números (los que no son primos) de tal
 * forma que no se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author noelia
 */
public class Arrays_11 {

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);

        int[] num = new int[10];
        int numPrimos = 0;

        //Recoger numeros por teclado y contar primos
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número: " + (i + 1));
            num[i] = sC.nextInt();
            if (esPrimo(num[i])) {
                numPrimos++;
            }
        }

        //Mostrar el contenido original del array junto al índice (0 – 9)
        System.out.println("------------------------------------------------");

        System.out.println("Array original: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Indice: " + (i) + "     Valor: " + num[i]);
        }

        //Mover los primos al principio del array
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (esPrimo(num[i])) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }

        //Mostrar el contenido final del array junto al índice (0 – 9)
        System.out.println("------------------------------------------------");
        System.out.println("Resultado de array ordenado:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Indice: " + (i) + "     Valor: " + num[i]);
        }
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
