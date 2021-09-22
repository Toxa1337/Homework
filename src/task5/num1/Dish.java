package task5.num1;

public abstract class Dish {
    private String material, protection, destiny, form;
    protected double volume;

    public Dish(String material, String protection, double volume, String destiny, String form){
        this.material=material;
        this.protection=protection;
        this.volume=volume;
        this.destiny=destiny;
        this.form=form;
    }

    public String StructureInfo(){
        return ("material: "+material+"has a "+protection+" protection type and use to "+destiny+" has a "+form+" form");
    }
    public abstract String toString();
}
