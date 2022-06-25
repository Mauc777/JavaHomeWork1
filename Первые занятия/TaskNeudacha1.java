import java.io.FileWriter;
import java.io.IOException;
public class TaskNeudacha1 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", true)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('5');
            fw.append('\n');
            fw.write("line 5855464646546");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // FileWriter.close();
        // Writer.flush();
        // Writer.close();
    } }
