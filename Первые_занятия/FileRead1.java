import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead1 {
    public static void main(String[] args) throws IOException {
        File fl = new File("Input111.txt");

        fl.createNewFile();
        FileWriter wr = new FileWriter("Input1.txt");
        wr.write("это примерный kjbnkbjblj \n  текст \n в котором все пока хорошо \n777");
        wr.flush();
        wr.close();


    }
    
}
