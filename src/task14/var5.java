package task14;

import java.lang.*;
import java.util.Scanner;
import java.util.Stack;

public class var5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> fPlayer = new Stack<>();
        Stack<Integer> sPlayer = new Stack<>();
        for (int i = 0; i < 5; i++) {
            fPlayer.push(scan.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            sPlayer.push(scan.nextInt());
        }
        int count = 0;

        while (!(fPlayer.isEmpty()) && !(sPlayer.isEmpty()))
        {
            int firstVal = fPlayer.get(0);
            int secondVal = sPlayer.get(0);
            fPlayer.removeElementAt(0);
            sPlayer.removeElementAt(0);
            switch (firstVal)
            {
                case 0:
                {
                    if (secondVal == 9)
                    {
                        fPlayer.push(firstVal);
                        fPlayer.push(secondVal);
                    }
                    else
                    {
                        sPlayer.push(firstVal);
                        sPlayer.add(secondVal);
                    }
                    break;
                }
                case 9:
                {
                    if (secondVal == 0)
                    {
                        sPlayer.push(firstVal);
                        sPlayer.push(secondVal);
                    }
                    else
                    {
                        fPlayer.push(firstVal);
                        fPlayer.push(secondVal);
                    }
                    break;
                }
                default:
                {
                    if (firstVal > secondVal) {
                        fPlayer.push(firstVal);
                        fPlayer.push(secondVal);
                    } else if (secondVal > firstVal) {
                        sPlayer.push(firstVal);
                        sPlayer.push(secondVal);
                    }
                    break;
                }
            }

            count++;
            if (count == 106) {
                System.out.println("botva");
                break;
            }
        }

        if (fPlayer.isEmpty()) {
            System.out.println("second " + count);
        } else {
            System.out.println("first " + count);
        }
    }
}