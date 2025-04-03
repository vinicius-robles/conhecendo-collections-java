package main.generics;


import java.util.HashMap;
import java.util.Map;

public class GenericsExemploMap {
    public static void main(String[] args) {
        // Exemplo sem generics
        Map mapSemGenerics = new HashMap();
        mapSemGenerics.put("Chave 1", 10);
        mapSemGenerics.put("Chave 2", "valor"); // Permite adicionar qualquer tipo de objeto

        // Exemplo com generics
        Map<String, Integer> mapGenerics = new HashMap();
        mapGenerics.put("Chave 1", 10);
        mapGenerics.put("Chave 2", 20);

        // Iterando sobre a lista com Generics
        for (Map.Entry<String, Integer> entry : mapGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", valor: " + valor);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object obj : mapSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + ", valor: " + valor);
        }
    }
}
