package task1;

public class var3 {
    public static void main(String[] args) {

        for (int it = 1; it <= 10; it++) {
            String str = String.format("%1$-4.3f", 1.0 / it);
            System.out.println(str);

        }
    }
}
