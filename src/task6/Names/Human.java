package task6.Names;

import task6.Nameable;

public class Human implements Nameable {
    private String name="Anton";
    @Override
    public void getName() {
        System.out.println(Human.class.getSimpleName()+" - "+ name);
    }
}
