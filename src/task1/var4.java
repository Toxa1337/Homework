package task1;

import java.util.Random;

public class var4 {
    public static void Sort(int[] array){
        int m;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int max = 10000, min = -10000;
        int[] rArray;
        rArray = new int[10];
        for (int i = 0; i < rArray.length; i++) {
            rArray[i] = min + (int) (Math.random() * ((max - min) + 1));
            System.out.print(rArray[i] + " ");
        }
        System.out.print("\n");
        Sort(rArray);
        System.out.print("\n");
        int[] rArray2 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < rArray2.length; i++) {
            rArray2[i] = rand.nextInt(90);
            System.out.print(rArray2[i] + " ");
        }
        System.out.print("\n");
        Sort(rArray2);
    }
}
