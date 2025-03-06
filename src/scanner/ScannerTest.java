package scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite ai");
        String inputText= input.nextLine();
        System.out.println("Você digitou: " + inputText);
    }
}
