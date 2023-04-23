import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Medical.txt");
            writer.write("Item 1: BMW\n");
            writer.write("Item 2: TATA\n");
            writer.write("Item 3: Maruti\n");
            writer.write("Item 4: Mahindra\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}