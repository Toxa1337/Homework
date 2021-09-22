package task7.part1;

public class Square extends Rectangle {
    public Square(){
        length = 5;
        width = 5;
        color = "Green";
        filled = true;
    }
    public Square(double side){
        length = side;
        width = side;
        color = "Green";
        filled = true;
    }
    public Square(double side, String color, boolean filled){
        length = side;
        width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return length;
    }
    public void setSide(double side){
        length = side;
        width = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "Shape: square, side: " + this.length + ", color: " + this.color;
    }
}
