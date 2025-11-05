package regex;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto1 = "levi, eren, mikasa, true, 200";
        String[] nomes = texto1.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
