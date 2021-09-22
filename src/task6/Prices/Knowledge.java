package task6.Prices;

import task6.Priceable;

public class Knowledge implements Priceable {
    static final double Price=1/0.0;
    @Override
    public void getPrice() {
        System.out.println(Knowledge.class.getSimpleName()+" = "+Price);
    }
}