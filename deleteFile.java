import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File file = new File("Medical.txt");
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}