package task5.num1;

public class Plate extends Dish {
    private double square;
    public Plate(double square){
        super("glass","silicate glass",0,"servings","round");
        this.square=square;
    }

    @Override
    public String toString() {
        return "Dish: plate, "+super.StructureInfo()+", Square= "+square+" sm^2";
    }
}
