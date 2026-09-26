package org.example;

import java.util.Scanner;

public class Vectores {

    static void main() {

        //Declaracion

        int[] miVectorNum ;

        //Inicializacion
        miVectorNum = new int[5];

        //Cambiar los valores de un vector o acceder
        System.out.println("info del vector: " + miVectorNum[4]);

        //Cambiarle el valor a una posicion fija - indice
        miVectorNum[1] = 5;


        //Recorrer todo el vector y ver todo lo que tiene por dentro
        for (int i = 0; i < miVectorNum.length; i++) {

            System.out.println("miVectorNum[" + i + "] = " +  miVectorNum[i]);
        }


        /*

        *A partir de un vector capturado por consola,
         calcula e imprime la suma de todos sus elementos y el promedio
          (recuerda usar double para que el promedio no se trunque).
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, indicame cuantos valores deseas calcular?: ");
        int cantidad = sc.nextInt();

        double[] listaNumeros = new double[cantidad];

        System.out.println("Por favor ingrese el listado de numeros: ");

        //Asignar los valores al vector
        for (int i = 0; i < listaNumeros.length; i++) {

            System.out.println("Num " + (i+1) + ": ");
            listaNumeros[i] = sc.nextDouble();
        }

        //Otro for para mostrar los valores del vector
        for (int i = 0; i < listaNumeros.length; i++) {

            System.out.println("listaNumeros[" + i + "] = " +  listaNumeros[i]);
        }


        //Calcular, suma, promedio a partir de un vector

        double suma =0;
        for (int i = 0; i < listaNumeros.length; i++) {

            suma += listaNumeros[i];
        }

        System.out.println("La suma de numeros es: "+ suma);
        System.out.println("El promedio es:" + (suma/ listaNumeros.length));


    }

}
