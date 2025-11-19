package nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest2 {
    public static void main(String[] args) {
        Path folderPath1 = Paths.get("path");
        try {
            if (Files.notExists(folderPath1)) {
                // Aqui so cria um diretório, mais de um não, se passar path/pathSub, dará erro
                // se a pasta pai não existir
                Path folderDirectory = Files.createDirectory(folderPath1);
            }


            Path subFolderPath = Paths.get("path/pathSub/pathSubSub");
            // aceita também criar uma pasta só
            Path subFolderDirectory = Files.createDirectories(subFolderPath);

            Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
            if (Files.notExists(filePath)) {
                Path filePathCreated = Files.createFile(filePath);
            }

            Path source = filePath;
            Path target = Paths.get("path2", "file_copied.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
