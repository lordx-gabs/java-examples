package io.test;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        File fileDirectory = new File("folder");
        boolean isCreateDirectory = fileDirectory.mkdir();
        System.out.println("isCreateDirectory = " + isCreateDirectory);
        File fileArchive = new File(fileDirectory, "file.txt");
        boolean fileArchiveCreated = false;
        try {
            fileArchiveCreated = fileArchive.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("fileArchiveCreated = " + fileArchiveCreated);
        File fileRenamed = new File(fileDirectory, "file_renamed.txt");
        boolean isRenamed = fileArchive.renameTo(fileRenamed);
        System.out.println("isRenamed = " + isRenamed);

        File directoryRenamed = new File("folder2");
        boolean directoryIsRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("directoryIsRenamed = " + directoryIsRenamed);

    }
}
