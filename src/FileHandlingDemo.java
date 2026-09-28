import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        File file = new File("student.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File exists: " + file.exists());

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }
    }
}