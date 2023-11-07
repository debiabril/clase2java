package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Leito");
        listaStrings.add("Mi");
        listaStrings.add("gatito");
        listaStrings.add("lindo");

        funtionalString interface1 = (interface2) -> {
            interface2.replaceAll(String::toUpperCase);
            System.out.println(interface2);
            return  interface2;
        };
        System.out.println(transformador(listaStrings, interface1));
    }

    static ArrayList<String> transformador (ArrayList<String> lista, funtionalString interface1){
        return interface1.stringes(lista);
    }
    @FunctionalInterface
    public interface funtionalString{
        ArrayList<String> stringes(ArrayList<String> stringcitos);
    }
}