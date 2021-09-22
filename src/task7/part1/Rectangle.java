package task7.part1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        width = 5;
        length = 25;
    }
    public Rectangle(double width){
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = 25;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return length+width;
    }
    @Override
    public String toString() {
        return "Shape: rectangle, length: "+this.length+", width: "+this.width+", color: "+this.color;
    }

}
