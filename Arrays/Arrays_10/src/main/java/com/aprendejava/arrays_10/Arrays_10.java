package com.aprendejava.arrays_10;

import java.util.Random;

/**
 * 10. Escribe un programa que genere 20 números enteros aleatorios entre 0 y
 * 100 y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
 * si es necesario.
 *
 * @author noelia
 */
public class Arrays_10 {

    public static void main(String[] args) {
        Random r = new Random();

        int[] num = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        int n = 0;
        int cuantosPares = 0;
        int cuantosImpares = 0;

        //Saco un numero aleatorio, si es par se guarda en el array de pares, si no en el de impares
        for (int i = 0; i < num.length; i++) {
            n = r.nextInt(101);

            if (n % 2 == 0) {
                pares[cuantosPares] = n;
                cuantosPares++;

            } else {
                impares[cuantosImpares] = n;
                cuantosImpares++;
            }
        }

        // Unir los arrays de pares e impares en uno solo
        for (int i = 0; i < cuantosPares; i++) {
            num[i] = pares[i];
        }
        for (int i = 0; i < cuantosImpares; i++) {
            num[cuantosPares + i] = impares[i];
        }
        // Muestro el array original
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    /* ---- OTRA SOLUCION ----
        int[] n = new int[20];
        int i;
        int j;
        int k;
        int aux;
        
        // Rellena el array con números aleatorios entre 0 y 100
        System.out.println("Array original");
    
        for (i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 101);
            System.out.print(n[i] + " ");
        }
    
        // En cada vuelta del for se coloca un par en su posición correcta
        for (i = 0; i < 20; i++) {
            // Busca el siguiente par a partir de la posición actual
            j = i;
            while ((n[j++] % 2 != 0) && (j < 20));
        
            // Desplaza el número par a su posición correcta (si quedan pares)
            if (j < 20) {
                for (k = j - 1; k > i; k--) {
                    aux = n[k];
                    n[k] = n[k - 1];
                    n[k - 1] = aux;
                }
            }
        }
     */
}
