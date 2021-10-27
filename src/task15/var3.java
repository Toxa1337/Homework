package task15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class var3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in;
        boolean check = true;
        try {
            FileWriter fW = new FileWriter("src/task15/test.txt");
            System.out.println("Enter message (for end input type END in empty string):");
            in = sc.nextLine();
            do {
                fW.write(in + "\r\n");
                in = sc.nextLine();
                if (in.endsWith("END")){
                    check=false;
                }
            } while (check);
            fW.close();
        } catch (IOException e) {
            System.out.println("Error: file doesn't exist, or input problem");
        }
    }
}