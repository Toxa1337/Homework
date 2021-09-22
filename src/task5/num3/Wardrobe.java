package task5.num3;

public class Wardrobe extends Furniture {

    char upType, downType;

    public Wardrobe(int code, double width,double length, double height, String pCountry, char upType, char downType){
        super(code, width,length, height, pCountry);
        this.upType=upType;
        this.downType=downType;

    }

    public void Area(){
        super.getArea();
    }

    @Override
    public String toString() {
        return "Object: Wardrobe, "+super.producingInfo()+", Area: "+super.getArea()+" WardrobeUp: "+upType+", WardrobeDown :"+downType;
    }
}