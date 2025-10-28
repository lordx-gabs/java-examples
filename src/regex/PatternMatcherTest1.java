package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest1 {
    public static void main(String[] args) {
        // \d todos os digitos
        // \D todos os caracteres que não digitos
        // \s todos os caracteres espaços em branco \t \n \f \r
        // \S todos os caracteres não espaços em branco
        // \w todos os caracteres de palavras a-z A-Z, digitos 0-9, _
        // \W todos os caracteres que não for incluso no \w
        String regex = "\\W";
        String texto2= "@ka_84l aej489";
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
