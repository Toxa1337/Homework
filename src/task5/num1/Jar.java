package task5.num1;

public class Jar extends Dish {

    Jar(){
      super("glass","glass",3000,"food storage","cylindrical");
    }

    @Override
    public String toString() {
        return "Dish: jar, "+super.StructureInfo()+", jar has a "+super.volume+" ml volume";
    }
}
