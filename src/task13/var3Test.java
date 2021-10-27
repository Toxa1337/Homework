package task13;
import java.lang.*;
import task13.var3;

public class var3Test {
    public static void output(var3.arrayList list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        var3.arrayList<var3.Cat> list = new var3.arrayList<>();
        list.add(new var3.Cat("Муся"));
        list.add(new var3.Cat("Ася"));
        list.add(new var3.Cat("Жужа"));
        list.add(new var3.Cat("Багира"));

        output(list);

        list.add(3, new var3.Cat("Мурка"));

        output(list);

        list.remove(2);

        output(list);

        list.set(1, new var3.Cat("Тишка"));

        output(list);

        list.clear();
        System.out.println("Список очищен, размер списка: " + list.size());
    }
}