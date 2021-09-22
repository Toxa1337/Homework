package task5.num3;

public class FurnitureShop {
    public static void main(String[] args) {
        Wardrobe d1 = new Wardrobe(12, 800,500, 2500, "China", 'A', 'A');
        System.out.println(d1);
        Table d2 = new Table(9, 500,800, 400, "Sweden", 'A', "rectangle");
        System.out.println(d2);
        Sofa d3 = new Sofa(34, 500,800, 250, "China", 'C', 'B');
        System.out.println(d3);
        Chair d4 = new Chair(23, 400,400, 600, "China", 'A', 'D');
        System.out.println(d4);
    }
}
