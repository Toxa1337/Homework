package task6.Prices;

import task6.Priceable;

public class Book implements Priceable {
    private double price=19.99;
    @Override
    public void getPrice() {
        System.out.println(Book.class.getSimpleName()+" = "+price+"$");
    }
}
