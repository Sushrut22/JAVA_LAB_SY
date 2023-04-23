import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class exceptionHandling1 {
    public static void main(String[] args) {
        // Checked exception example: FileNotFoundException
        try {
            InputStream input = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        // Checked exception example: ClassNotFoundException
        try {
            Class.forName("com.example.ClassThatDoesNotExist");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }

        // Unchecked exception example: ArithmeticException
        int a = 5, b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }

        // Unchecked exception example: NullPointerException
        String s = null;
        try {
            int length = s.length();
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception!");
        }

        // Finally block example
        try {
            InputStream input = new FileInputStream("file.txt");
            // Use input stream...
        } catch (IOException e) {
            System.out.println("IOException occurred!");
        } finally {
            System.out.println("Finally block executed!");
        }
    }
}