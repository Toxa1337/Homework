package task14;

//Используйте для организации хранения структуру данных DoubleList.

import java.lang.*;
import java.util.Scanner;
import java.util.LinkedList;

public class var4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> fPlayer = new LinkedList<>();
        LinkedList<Integer> sPlayer = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            fPlayer.addLast(scan.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            sPlayer.addLast(scan.nextInt());
        }
        int count = 0;

        while (fPlayer.size() > 0 && sPlayer.size() > 0) {
            int firstVal = fPlayer.pollFirst();
            int secondVal = sPlayer.pollFirst();
            switch (firstVal)
            {
                case 0:
                {
                    if (secondVal == 9)
                    {
                        fPlayer.addLast(firstVal);
                        fPlayer.addLast(secondVal);
                    }
                    else
                    {
                        sPlayer.addLast(firstVal);
                        sPlayer.addLast(secondVal);
                    }
                    break;
                }
                case 9:
                {
                    if (secondVal == 0)
                    {
                        sPlayer.addLast(firstVal);
                        sPlayer.addLast(secondVal);
                    }
                    else
                    {
                        fPlayer.addLast(firstVal);
                        fPlayer.addLast(secondVal);
                    }
                    break;
                }
                default:
                {
                    if (firstVal > secondVal) {
                        fPlayer.addLast(firstVal);
                        fPlayer.addLast(secondVal);
                    } else if (secondVal > firstVal) {
                        sPlayer.addLast(firstVal);
                        sPlayer.addLast(secondVal);
                    }
                    break;
                }
            }

            count++;
            if (count == 106) {
                System.out.println("botva");
                return;
            }
        }

        if (fPlayer.isEmpty()) {
            System.out.println("sPlayer " + count);
        } else {
            System.out.println("fPlayer " + count);
        }
    }
}