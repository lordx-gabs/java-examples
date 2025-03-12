package exceptions.exception;

import exceptions.exception.domain.Leitor1;
import exceptions.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourceTest01 {
    public static void main(String[] args) {
        readFile3();
    }

    private static void readFile3() {
        //fecha o inverso da ordem
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile1() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
