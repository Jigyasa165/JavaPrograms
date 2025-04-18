import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello, File Handling in Java!");
            fw.close();

            FileReader fr = new FileReader("output.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
