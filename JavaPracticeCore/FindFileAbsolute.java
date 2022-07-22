package JavaPracticeCore;

import java.io.File;

public class FindFileAbsolute {
    public static void main(String[] args) {

        // НАходит абсолютный путь к файлу во всем компе!!!
        try {
            String pathProject = System.getProperty("user.dir");
            // String pathFile = pathProject.concat("/задача по закреп материала лекции 1 java");
            String pathFile = pathProject.concat("C:/Users/Kozan/Desktop/Java/JavaHomeWorkBelovik/JavaPracticeCore");
            File f1 = new File(pathFile);
            System.out.println("try = пытаться / попытка");
            System.out.println(f1.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("catch = ловит/ поймать");
        } finally {
            System.out.println("finally = в конце концов");
        }

    }

}
