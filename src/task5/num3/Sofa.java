package task5.num3;

public class Sofa extends Furniture {

    char leftType, rightType;

    public Sofa(int code, double width,double length, double height, String pCountry, char leftType, char rightType){
        super(code, width,length, height, pCountry);
        this.leftType=leftType;
        this.rightType=rightType;

    }

    public void Area(){
        super.getArea();
    }

    @Override
    public String toString() {
        return "Object: Wardrobe, "+super.producingInfo()+", Area: "+super.getArea()+" SofaLeft: "+leftType+", SofaRight :"+rightType;
    }
}
