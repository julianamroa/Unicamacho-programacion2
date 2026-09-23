package org.example;

import java.util.Scanner;

public class EjercicioB1 {

    static void main() {
        //ventanilla unica - tramite de radicado - ok
        //solo se captura el numero - int positivo - ok

        //detectar cantidad de digitos - ok, la suma de sus digitos-ook
        //digito mayor -ok, capicua - lee adelante que hacia atras


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su radicado: ");

        int numero = sc.nextInt();
        sc.nextLine();
        sc.close();

        if(numero<0){

            System.out.println("Numero es negativo, radicado debe ser positivo");

            return;
        }


        int numOriginal = numero, numInvertido = 0, cantidadDigitos=0,
        sumaDigitos=0, digitoMayor=0, contadorRepeticiones=0;

        if(numero == 0 ){
            cantidadDigitos=1;
        }else{

            while(numero!=0){

                int digito = numero %10;
                System.out.println("digito: " + digito);

                cantidadDigitos=cantidadDigitos+1;

                numero = numero/10;

                sumaDigitos = sumaDigitos + digito;

                if(digito>digitoMayor){
                    digitoMayor = digito;
                }

                numInvertido = numInvertido *10 + digito;

            }

            System.out.println("La cantidad de digitos es "+ cantidadDigitos);
            System.out.println("La suma de digitos es "+ sumaDigitos);
            System.out.println("El digito mayor es "+ digitoMayor);
            System.out.println("El numero invertido es  "+ numInvertido);
            boolean esCapicua = (numOriginal == numInvertido);

            if(esCapicua==true){
                System.out.println("Si es un numero capicua");
            }else{
                System.out.println("No es un numero capicua");
            }





        }





    }
}
