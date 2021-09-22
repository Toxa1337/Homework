package task5.num1;

public class Cup extends Dish {
    private boolean handle;

    public Cup(boolean handle){
        super("ceramic","lacquer",250,"servings", "cylindrical");
        this.handle=handle;
    }

    @Override
    public String toString() {
        if (handle){
            return ("Dish: cup, "+super.StructureInfo()+" and has a handle");
        }else {
            return ("Dish: cup, "+super.StructureInfo()+" and has not a handle");
        }
    }
}
