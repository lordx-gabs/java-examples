package exceptions.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        try {
            createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createNewFile() throws IOException {
        File file = new File("files\\teste.txt");

        boolean isCreated = file.createNewFile();
        System.out.println("ata" + isCreated);
    }
}
