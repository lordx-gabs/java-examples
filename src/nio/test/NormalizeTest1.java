package nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest1 {
    public static void main(String[] args) {
        String directoryProject = "home/gabs/dev";
        String archiveTxt = "../../arquivo.txt";
        Path p1 = Paths.get(directoryProject, archiveTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("/home/./gabs/./dev/");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
