package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        System.out.println("Ejercicios de bucles y while clase");

        Scanner scan = new Scanner(System.in);

        System.out.println("Adivina mi color favorito: ");
        String bandera = scan.nextLine();

        while(!bandera.equals("celeste")){

            System.out.println("Ese no es... vuelve a intentarlo");
            System.out.println("Adivina mi color favorito:");
            bandera = scan.nextLine();
        }
        System.out.println("Muy bien...");

    }
}
