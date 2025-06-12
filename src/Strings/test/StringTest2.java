package Strings.test;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = "Lucas";
        String numeros = "12345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("c", "F"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.length());
        // o primeiro argumento é o índice inicial (index) e o segundo
        // é o índice final (size)
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(2)); // do índice 2 até o final
        System.out.println(numeros.contains("23")); // verifica se contém a sequência
        System.out.println(numeros.trim());
        System.out.println(numeros.strip()); // java 11
    }
}
