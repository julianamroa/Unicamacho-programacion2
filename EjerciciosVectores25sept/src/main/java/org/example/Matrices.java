package org.example;

import java.util.Random;

public class Matrices {
    static void main() {

        //Declaracion

        int[][] miMatrizNum ;

        //Inicializacion
        miMatrizNum = new int[5][8];

        //Cambiar los valores de un matriz o acceder
        System.out.println("info del matriz: " + miMatrizNum[2][3]);

        //Cambiarle el valor a una posicion fija - indice
        miMatrizNum[2][3] = 5;

        //Cambiar los valores de un matriz o acceder
        System.out.println("info del matriz: " + miMatrizNum[2][3]);

        //Generar numeros aleatorios para llenar mi matriz
        Random num_aleatorio = new Random(5);


        double suma =0;
        //Como visualizar la matriz
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.print("  ");
            for (int j = 0; j <8; j++) {

                System.out.print("    ");

                miMatrizNum[i][j] = num_aleatorio.nextInt(9);

                System.out.print(miMatrizNum[i][j]);

                suma+=miMatrizNum[i][j];
            }

            System.out.println("");

        }

        //A partir de una matriz capturada por consola,
        // calcula e imprime la suma de todos sus elementos.

        System.out.println("La suma de todos los valores es: " + suma);


    }
}
