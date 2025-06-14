package Strings.test;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        String nome = "Lucas";
        StringBuilder sb = new StringBuilder();
        sb.append("Olá, ");
        String subString = sb.substring(0, 3);
        System.out.println(subString);
        sb.reverse();
        sb.reverse();
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
