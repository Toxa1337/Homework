package task6.Prices;

import task6.Priceable;

public class Car implements Priceable {
    private double price=3000000;
    @Override
    public void getPrice() {
        System.out.println(Car.class.getSimpleName()+" = "+price+"$");
    }
}
