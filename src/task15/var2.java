package task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class var2 {
    public static void main(String[] args) {
        try {
            Scanner fRead = new Scanner(new File("src/task15/test.txt"));
            System.out.println("File content:");
            while (fRead.hasNextLine()) System.out.println(fRead.nextLine());
            fRead.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file doesn't exist, or output problem");
        }
    }
}