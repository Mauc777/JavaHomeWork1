import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class FileRead222 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Input111.txt");
        char [] abh =new char[300];
        fr.read(abh);
        for(char c : abh) 
        System.out.print(c);

        int c = Integer.parseInt("42");
        // int k = Integer.parseInt("42");

    
}}
