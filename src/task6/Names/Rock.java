package task6.Names;

import task6.Nameable;

public class Rock implements Nameable {
    private String name="Jerry";
    @Override
    public void getName() {
        System.out.println(Rock.class.getSimpleName()+" - "+name);
    }
}
