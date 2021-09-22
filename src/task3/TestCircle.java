package task3;

public class TestCircle {
    public static void main(String[] args) {
        Circle d1 = new Circle(10, 15, 40, "Blue");
        Circle d2 = new Circle(43.4, -12.3, 6);
        Circle d3 = new Circle(-17.3, 93.1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.setColor("Yellow");
        d2.setPointX(-43);
        d3.setRadius(19);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
