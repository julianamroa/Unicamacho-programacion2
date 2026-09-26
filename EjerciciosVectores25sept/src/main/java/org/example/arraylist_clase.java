package org.example;

import java.util.ArrayList;

public class arraylist_clase {

    static void main() {


        ArrayList lista = new ArrayList();

        lista.add("Hola");
        lista.add(5);

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(lista.get(i));

        }

    }
}

