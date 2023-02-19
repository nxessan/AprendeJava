package com.aprendejava.arrays_08;

import java.util.Scanner;

/**
 * 8. Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 * @author noelia
 */
public class Arrays_08 {

    public static void main(String[] args) {

        Scanner sC = new Scanner(System.in);

        int[] temp = new int[12];
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
                        "Diciembre"};

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduzca la temperatura de " + mes[i]);
            temp[i] = sC.nextInt();

        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println(mes[i] + " -------> " + temp[i] + "ºC");
        }
    }
}
