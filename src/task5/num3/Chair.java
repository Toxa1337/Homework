package task5.num3;

public class Chair extends Furniture {
    char upType, downType;

    public Chair(int code, double width,double length, double height, String pCountry, char upType, char downType){
        super(code, width,length, height, pCountry);
        this.upType=upType;
        this.downType=downType;

    }

    public void Area(){
        super.getArea();
    }

    @Override
    public String toString() {
        return "Object: Chair, "+super.producingInfo()+", Area: "+super.getArea()+" ChairUp: "+upType+", ChairDown :"+downType;
    }
}
