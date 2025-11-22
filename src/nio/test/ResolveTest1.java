package nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest1 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/gabs");
        Path archive = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(archive);
        System.out.println(resolve);

        Path absolutePath = Paths.get("/home/gabs");
        Path relativePath = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 " + absolutePath.resolve(relativePath));
        System.out.println("2 " + absolutePath.resolve(file));
        System.out.println("3 " + relativePath.resolve(absolutePath));
        System.out.println("4 " + relativePath.resolve(file));
        System.out.println("5 " + file.resolve(absolutePath));
        System.out.println("6 " + file.resolve(relativePath));
    }
}
