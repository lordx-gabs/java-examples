package io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("FileTest01.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
            System.out.println("File AbsolutePath: " + file.getAbsolutePath());
            System.out.println("File path: " + file.getPath());
            System.out.println("File is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified())
                    .atZone(ZoneId.systemDefault()).toLocalDateTime());

            boolean exists = file.exists();
            if(exists) {
                System.out.println("File deleted " + file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
