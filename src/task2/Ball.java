package task2;

public class Ball {
    private String color1;
    private String color2;
    private String pattern;
    private float diameter;

    public Ball (String c1, String c2, String p, float d){
        color1 = c1;
        color2 = c2;
        pattern = p;
        diameter = d;
    }
    public Ball (String c1, String c2, String p){
        color1 = c1;
        color2 = c2;
        pattern = p;
        diameter = 300;
    }
    public Ball (String c1, String c2){
        color1 = c1;
        color2 = c2;
        pattern = "zebra";
        diameter = 300;
    }
    public Ball (String c1){
        color1 = c1;
        color2 = "green";
        pattern = "zebra";
        diameter = 300;
    }
    public Ball (){
        color1 = "yellow";
        color2 = "blue";
        pattern = "two parts";
        diameter = 300;
    }
    public void setColor1(String color1) {
        this.color1 = color1;
    }
    public void setColor2(String color2) {
        this.color2 = color2;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
    public String getColor1(){
        return color1;
    }
    public String getColor2() { return color2; }
    public String getPattern() {
        return pattern;
    }
    public float getDiameter() {
        return diameter;
    }
    public String toString(){ return this.color1+" "+this.color2+" ball has a "+this.pattern+ " pattern and a "+this.diameter+" mm diameter"; }
}
