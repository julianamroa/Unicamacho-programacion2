package org.example;

public class Ejercicio1 {

    static void main() {

        /*
        *
        *
        * */


        int totalEntregados = 0;
        int contadorCondicional2For =0;

        for (int jornada = 1; jornada <= 5; jornada++) {
            System.out.println("Jornada: " + jornada);
            if (jornada % 2 == 0) {
                System.out.println("Jornada sin atención - no hay mercados");
                continue;              // jornada sin atencion al publico
            }
            for (int lote = jornada; lote > 0; lote--) {
                System.out.println("Lote: " + lote);
                contadorCondicional2For++;
                if (lote == 3) {
                    System.out.println("Lote retenido por calidad - no hay mercados");

                    continue;             // lote retenido por control de calidad
                }
                totalEntregados += lote;
                System.out.println("Total entregados: " + totalEntregados);
            }
        }
        System.out.println(totalEntregados);
        System.out.println("Se entró al condicional del bucle : " + contadorCondicional2For);

    }
}
