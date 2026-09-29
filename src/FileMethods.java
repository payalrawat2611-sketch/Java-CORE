import java.io.File;

public class FileMethods {

    public static void main(String[] args) {

        File file = new File("student.txt");

        // Check if file exists
        System.out.println("Exists: " + file.exists());

        // Get file name
        System.out.println("File Name: " + file.getName());

        // Get absolute path
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        // Get file size
        System.out.println("File Size: " + file.length() + " bytes");

        // Check whether it is a file
        System.out.println("Is File: " + file.isFile());

        // Check whether it is a directory
        System.out.println("Is Directory: " + file.isDirectory());
    }
}