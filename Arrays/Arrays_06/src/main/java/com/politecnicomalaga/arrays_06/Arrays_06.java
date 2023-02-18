package com.politecnicomalaga.arrays_06;

import java.util.Scanner;

/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
 * muestra el contenido del array.
 *
 * @author noelia
 */
public class Arrays_06 {

    public static void main(String[] args) {

        Scanner sC = new Scanner(System.in);

        int numeros[] = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1));
            numeros[i] = sC.nextInt();
        }
        
        int aux = numeros[numeros.length -1];
        
        for (int i = numeros.length - 1; i > 0; i--){
            numeros[i] = (numeros[i-1]);
        }
        numeros[0]= aux;
        
        for(int n:numeros){
            String str = String.valueOf(n);
            System.out.println(str + ", ");
        } 
    }
}
