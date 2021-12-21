package task26;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose payment: ");
        System.out.println("1. Online Wallet ");
        System.out.println("2. Credit Card ");
        int varPay = scanner.nextInt();
        Choice payChoice = new Choice();
        switch (varPay){
            case 1:
                payChoice.setPay(new OnlineWallet());
                break;
            case 2:
                payChoice.setPay(new CreditCard());
                break;
            default:
                break;
        }
        payChoice.executePay();
    }
}
