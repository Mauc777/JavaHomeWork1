package JavaPracticeCore;

import java.io.File;

public class CatalogWorkCreate {
    public static void main(String[] args) {

        // Работа с каталогами по аналогии как и работа с файлами
        String pathProject = System.getProperty("user.dir");

        String pathDir = pathProject.concat("/files");

        File dir = new File(pathDir);

        System.out.println(dir.getAbsolutePath());

        if (dir.mkdir()) {

            System.out.println("+");

        } else {

            System.out.println("-");

        }

        for (String fname : dir.list()) {

            System.out.println(fname);

        }
    }

}
