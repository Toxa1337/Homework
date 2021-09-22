package task5.num2;

public class Pomeranian extends Dog{
    public Pomeranian(){
        super("Fluffy","wool","stubborn","spitz",3);
    }

    @Override
    public String getBreed() {
        return Pomeranian.class.getSimpleName();
    }

    @Override
    public String toString() {
        return "Dog: "+getBreed()+", "+super.getInfo()+"\n"+super.intoHumanAge();
    }
}
