package io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("fileWriter.txt");
        try(FileReader fr = new FileReader(file)) {
//            char[] in = new char[5];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while((i = fr.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
