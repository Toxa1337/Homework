package task6.Names;

import task6.Nameable;

public class Star implements Nameable {
    private String name="Solar";
    @Override
    public void getName() {
        System.out.println(Star.class.getSimpleName()+" - "+name);
    }
}
