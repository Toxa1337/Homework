package task1;

public class var1 {
    public static void main(String[] args) {
        int[] mass = new int[5];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * (9 - 0) + 1);
            System.out.print(mass[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Result:");
        System.out.print(summaFor(mass)+" = ");
        System.out.print(summaWhile(mass)+" = ");
        System.out.print(summaDoWhile(mass));
    }
    //
    private static int summaFor(int[] mass) {
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            summ += mass[i];
        }
        return summ;
    }
    //
    private static int summaWhile(int[] mass) {
        int i = 0, summ = 0;
        while (i < mass.length) {
            summ += mass[i];
            i++;
        }
        return summ;
    }
    //
    private static int summaDoWhile(int[] mass) {
        int i = 0, summ = 0;
        do {
            summ += mass[i];
            i++;
        } while (i < mass.length);
        return summ;
    }
}
