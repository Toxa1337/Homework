package task26;

import java.util.Scanner;

public class OnlineWallet implements Pay{
    public void pay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wallet num: ");
        String numW = scanner.nextLine();
        System.out.println("Success operation. Money will be debited from your wallet soon");
    }
}
