package com.politecnicomalaga.arrays_01;

import com.sun.jdi.Value;

/**
 *
 * @author noelia
 */
public class Arrays_01 {
    /*
    * Define un array de 12 números enteros con nombre num y asigna los valores
    * según la tabla que se muestra a continuación. Muestra el contenido de todos
    * los elementos del array. ¿Qué sucede con los valores de los elementos que
    * no han sido inicializados?
    * Posición 0 1 2 3 4 5 6 7 8 9 10 11
    * Valor   39-2    0   14   5 120
     */
    public static void main(String[] args) {
        int numeros [] = new int[12];

        numeros[0] = 39;
        numeros[1] = -2;
        numeros[4] = 0;
        numeros[6] = 14;
        numeros[8] = 5;
        numeros[9] = 120;

        //ForEach
        for (int i : numeros) {
            String verNumeros = String.valueOf(i);
            System.out.print(verNumeros + " ");
        }
    }
}
