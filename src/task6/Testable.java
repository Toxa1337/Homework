package task6;

import task6.Names.Human;
import task6.Names.Rock;
import task6.Names.Star;
import task6.Prices.Book;
import task6.Prices.Car;
import task6.Prices.Knowledge;

public class Testable {
    public static void main(String[] args){
        Human d1 = new Human();
        Rock d2 = new Rock();
        Star d3 = new Star();
        Book d4 = new Book();
        Car d5 = new Car();
        Knowledge d6 = new Knowledge();
        d1.getName();
        d2.getName();
        d3.getName();
        d4.getPrice();
        d5.getPrice();
        d6.getPrice();
    }
}
