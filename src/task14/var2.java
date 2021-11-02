package task14;

//Используйте для организации хранения структуру данных Queue.

import java.lang.*;
import java.util.*;
public class var2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> fPlayer = new ArrayDeque<>();
        Queue<Integer> sPlayer = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            fPlayer.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            sPlayer.add(scan.nextInt());
        }
        int count = 0;

        while (fPlayer.size() > 0 && sPlayer.size() > 0) {
            int firstVal = fPlayer.poll();
            int secondVal = sPlayer.poll();
            switch (firstVal)
            {
                case 0:
                {
                    if (secondVal == 9)
                    {
                        fPlayer.add(firstVal);
                        fPlayer.add(secondVal);
                    }
                    else
                    {
                        sPlayer.add(firstVal);
                        sPlayer.add(secondVal);
                    }
                    break;
                }
                case 9:
                {
                    if (secondVal == 0)
                    {
                        sPlayer.add(firstVal);
                        sPlayer.add(secondVal);
                    }
                    else
                    {
                        fPlayer.add(firstVal);
                        fPlayer.add(secondVal);
                    }
                    break;
                }
                default:
                {
                    if (firstVal > secondVal) {
                        fPlayer.add(firstVal);
                        fPlayer.add(secondVal);
                    } else if (secondVal > firstVal) {
                        sPlayer.add(firstVal);
                        sPlayer.add(secondVal);
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