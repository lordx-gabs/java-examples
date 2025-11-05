package regex;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto1 = "levi,eren,mikasa,true,200";
        Scanner scanner = new Scanner(texto1);
        scanner.useDelimiter(",");
        while(scanner.hasNext()) {
           if(scanner.hasNextInt()) {
               int i = scanner.nextInt();
               System.out.println("int: " + i);
           } else if (scanner.hasNextBoolean()) {
               boolean b = scanner.nextBoolean();
               System.out.println("boolean: " + b);
           } else {
               String s = scanner.next();
               System.out.println("String: " + s);
           }
        }

        Scanner scannerKeyBoard = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String textoDigitado = scannerKeyBoard.nextLine();
        System.out.println("Voce digitou: " + textoDigitado);
    }
}
