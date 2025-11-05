package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest4 {
    public static void main(String[] args) {
        // \d todos os digitos
        // \D todos os caracteres que não digitos
        // \s todos os caracteres espaços em branco \t \n \f \r
        // \S todos os caracteres não espaços em branco
        // \w todos os caracteres de palavras a-z A-Z, digitos 0-9, _
        // \W todos os caracteres que não for incluso no \w
        // [] conjunto de caracteres
        // ? 0 ou 1 ocorrência do elemento
        // * 0 ou mais ocorrências do elemento
        // + 1 ou mais ocorrências do elemento
        // {n,m} de n até m ocorrências do elemento
        // () agrupa elementos
        // | ou
        // $  fim da linha
        // ^ início da linha
        // . 1.3= 123, 133, 1@3
        String regex = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto2= "luffy@hotmail.com, joao@gmail.com," +
                " &%&, &*&zoro@mail.com.br, teste@gmail";
        System.out.println("&*&zoro@mail.com.br".matches(regex));
        System.out.println(Arrays.toString(texto2.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: " + texto2);
        System.out.println("Expresão Regular: " + regex);
        System.out.println("Coincidencias: ");
        while (matcher.find()) {
            System.out.println("Índice inicial: " + matcher.start() +
                    " | Índice final: " + matcher.end() + " | Texto: " +
                    matcher.group());
        }
    }
}
