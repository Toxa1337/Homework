package task5.num3;

public class Table extends Furniture {

    char legType;
    String form;

    public Table(int code, double width,double length, double height, String pCountry, char legType, String form){
        super(code, width,length, height, pCountry);
        this.legType=legType;
        this.form=form;

    }

    public void Area(){
        super.getArea();
    }

    @Override
    public String toString() {
        return "Object: Table, "+super.producingInfo()+", Area: "+super.getArea()+" legType: "+legType+", Form:"+form;
    }
}
