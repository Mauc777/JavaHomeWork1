package JavaPracticeCore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CreateNewFile {
    public static void main(String[] args) {
        // Работа с файловой системой. Файлы. Ошибки

        // String line = "123";
        try {
            // String pathProject = System.getProperty("user.dir");
            // String pathFile = pathProject.concat("C:/Users/Kozan/Desktop/Java/JavaHomeWorkBelovik/JavaPracticeCore");
            File f3 = new File("file54546456.txt");
            if (f3.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                BufferedReader bf = new BufferedReader(new FileReader(f3));
                System.out.println("file.existet = файл.существовал");
                // line = bf.readLine();
                bf.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println();
        }

    }

}
