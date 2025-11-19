package nio.test;


import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest1 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\biels\\OneDrive\\Área de Trabalho\\java-examples\\path_test");
        Path p2 = Paths.get("C:\\Users\\biels\\OneDrive\\Área de Trabalho\\java-examples",
                "path_test");
        Path p3 = Paths.get("C:",
                "Users\\biels\\OneDrive\\Área de Trabalho\\java-examples", "path_test");
        Path p4 = Paths.get("C:",
                "Users", "biels", "OneDrive", "Área de Trabalho", "java-examples", "path_test");
        System.out.println(p1.getFileName());
    }
}
