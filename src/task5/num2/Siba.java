package task5.num2;

public class Siba extends Dog{

    public Siba(){
        super("Toby","plush","smart","hunting",4);
    }

    @Override
    public String getBreed() {
        return Siba.class.getSimpleName();
    }

    @Override
    public String toString() {
        return "Dog: "+getBreed()+", "+super.getInfo()+"\n"+super.intoHumanAge();
    }
}
