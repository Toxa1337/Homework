package task2;

public class Library {
    public static void main(String[] args) {
        Book d1 = new Book("Rainbow", "Bober", 2002, "soft", "Nebosvod", 50);
        Book d2 = new Book("Rain");
        Book d3 = new Book();
        d3.setPubDate(2005);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
