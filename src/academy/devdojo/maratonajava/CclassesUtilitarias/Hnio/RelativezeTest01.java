package academy.devdojo.maratonajava.CclassesUtilitarias.Hnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativezeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/willian");
        Path clas= Paths.get("/home/willian/devdojo/OlaMundo.java");

        Path pathtoclas= dir.relativize(clas);
        System.out.println(pathtoclas);

        Path absoluto1 = Paths.get("/home/willian");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/willian/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("2 "+absoluto3.relativize(absoluto1));
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        System.out.println("4 "+relativo1.relativize(relativo2));
        System.out.println("5 "+relativo1.relativize(relativo1));

    }
}
