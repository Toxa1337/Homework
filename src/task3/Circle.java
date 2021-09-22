package task3;

public class Circle {
    private double pointX, pointY, radius;
    String  color;
    Circle (double pointX,double pointY,double radius,String color){
        this.pointX = pointX;
        this.pointY = pointY;
        this.radius = radius;
        this.color = color;
    }
    Circle (double pointX,double pointY,double radius){
        this.pointX = pointX;
        this.pointY = pointY;
        this.radius = radius;
        this.color = "Black";
    }
    Circle (double pointX,double pointY){
        this.pointX = pointX;
        this.pointY = pointY;
        this.radius = 15.7;
        this.color = "Green";
    }
    Circle (){
        this.pointX = 0;
        this.pointY = 0;
        this.radius = 17.4;
        this.color = "Red";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }
    public String toString() {
        return "Circle: Center ["+pointX+","+pointY+"], radius= " + radius + ", color=" + color;
    }
}
