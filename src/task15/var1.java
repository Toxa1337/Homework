package task15;


import java.io.*;
import java.util.Scanner;

public class var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fW = new FileWriter("src/task15/test.txt");
            System.out.println("Enter message:");
            fW.write(sc.nextLine());
            fW.close();
        } catch (IOException e) {
            System.out.println("Error: file doesn't exist, or input problem");
        }
    }
}