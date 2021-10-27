package task13;

//Протестируйте работу коллекции ArrayList

import java.lang.*;
import java.util.ArrayList;



public class var1 {

    public static class Cat{
        String name;
        public Cat(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void output(ArrayList<Cat> c)
    {
        for(int i = 0; i < c.size(); i++)
        {
            System.out.println(c.get(i).toString());
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat barsik = new Cat("Барсик");
        Cat pushok = new Cat("Пушок");
        Cat matroskin = new Cat("Матроскин");
        Cat murzik = new Cat("Мурзик");

        cats.add(barsik);
        cats.add(matroskin);
        cats.add(murzik);
        cats.add(pushok);

        System.out.println("1-й элемент списка");
        System.out.println(cats.get(0));
        System.out.println("\n");

        cats.add(new Cat("Тус"));
        System.out.println("Добавили в конец");
        output(cats);

        cats.add(3, new Cat("Жужа"));
        System.out.println("Добавили на 4-е место");
        output(cats);

        cats.set(0, new Cat("Шлёпа"));
        System.out.println("Замена первого элемента");
        output(cats);

        cats.remove(cats.size()-1);
        cats.remove(cats.size()-1);
        System.out.println("Последние два элемента удалены");
        output(cats);

        cats.clear();
        System.out.println("Список очищен");
        System.out.println("Размер списка: " + cats.size());
    }
}
