package task1;

import java.util.Scanner;

public class var5 {
    public static void main(String[] args) {
        System.out.println("Number:");
        Scanner scan = new Scanner(System.in);
        int number = (scan.hasNextInt()) ? (scan.nextInt()) : 0;
        if (number >= 1) {
            int i = 1, out = 1;
            while (i <= number) {
                out *= i;
                i++;
            }
            System.out.println(number + "! = " + out);
        } else { System.out.println("No way"); }
    }
}
