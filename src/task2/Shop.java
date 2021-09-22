package task2;

public class Shop {
    public static void main(String[] args) {
        Ball d1 = new Ball("Red", "Blue", "Zig-zag", 200);
        Ball d2 = new Ball("Rainbow");
        Ball d3 = new Ball();
        d3.setDiameter(1000.5f);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
