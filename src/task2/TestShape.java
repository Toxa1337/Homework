package task2;

public class TestShape {
    public static void main(String[] args) {
        task2.Shape d1 = new task2.Shape("Square");
        task2.Shape d2 = new task2.Shape("Triangle", "Yellow");
        task2.Shape d3 = new task2.Shape();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.setColor("Red");
        d2.setForm("Hexagon");
        d3.setColor("Pink");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
