package com.aprendejava.arrays_07;

import java.util.Random;
import java.util.Scanner;

/**
 * 7. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que
 * los muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 *
 * @author noelia
 */
public class Arrays_07 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sC = new Scanner(System.in);
        int valor1, valor2;

        int numeros[] = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(0, 21);

            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("Introduzca el valor 1: ");
        valor1 = sC.nextInt();
        System.out.println("Introduzca el valor 2: ");
        valor2 = sC.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if(numeros[i] == valor1){
                numeros[i] = valor2;
                System.out.print("\"" + valor2 + "\"" + " ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }

    }
}
