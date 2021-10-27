package task15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class var4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in;
        try {
            FileWriter fW = new FileWriter("src/task15/test.txt", true);
            System.out.println("Enter message (for end input type END in empty string):");
            in = sc.nextLine();
            do {
                fW.append(in + "\r\n");
                in = sc.nextLine();
            } while (!in.endsWith("END"));
            fW.close();
        } catch (IOException e) {
            System.out.println("Error: file doesn't exist, or input problem");
        }
    }
}