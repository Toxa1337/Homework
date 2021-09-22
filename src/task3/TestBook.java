package task3;

import task2.Book;

public class TestBook {
    public static void main(String[] args) {
        task2.Book d1 = new task2.Book("Rainbow", "Bober", 2002, "soft", "Nebosvod", 50);
        task2.Book d2 = new task2.Book("Rain");
        task2.Book d3 = new Book();
        d3.setPubDate(2005);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
