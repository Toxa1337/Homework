package task3.Human;

public class Body {
    private double length1, length2, length3;
    private char hair;
    public Body(double length1, double length2, double length3, char hair){
        this.length1=length1;
        this.length2=length2;
        this.length3=length3;
        this.hair=hair;
    }

    public double getLength1() {
        return length1;
    }

    public double getLength2() {
        return length2;
    }

    public double getLength3() {
        return length3;
    }

    public char getHair() {
        return hair;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public void setLength3(double length3) {
        this.length3 = length3;
    }

    public void setHair(char hair) {
        this.hair = hair;
    }

    public String toString() {
        return "Body: " + "length1=" + length1 + ", length2=" + length2 + ", length3=" + length3 + ", hair=" + hair;
    }
}