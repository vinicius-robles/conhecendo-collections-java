package main.generics;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        // Exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

        // Exemplo com generics
        Set<String> conjuntoGenerics = new HashSet();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
