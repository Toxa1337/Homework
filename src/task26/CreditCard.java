package task26;

import java.util.Scanner;

public class CreditCard implements Pay{
    public void pay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Card num: ");
        String numCard = scanner.nextLine();
        System.out.println("Success operation. Money will be debited from your wallet soon");
    }
}
