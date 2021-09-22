package task5.num3;

public abstract class Furniture {

    protected int code;
    protected double width;
    protected double length;
    protected double height;
    protected String pCountry;

    public Furniture(int code, double width,double length, double height, String pCountry){
        this.code = code;
        this.width = width;
        this.length=length;
        this.height=height;
        this.pCountry=pCountry;
    }

    public String getArea(){
        return "width x length x height = " +width+"x"+length+"x"+height+" = "+width*length*height+" mm^3";
    }

    public String producingInfo(){
        return "Furniture code: "+code+", Producing country: "+pCountry;
    }

    public abstract String toString();

}
