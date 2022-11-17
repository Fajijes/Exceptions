package Sem1.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Method3 {

    public static void main(String args[]) throws FileNotFoundException {
        File f = new File("F://java/file.txt");
        FileReader fr = new FileReader(f);
    }
}