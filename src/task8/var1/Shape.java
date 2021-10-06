package task8.var1;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
protected Color coolor;
protected int x,y, w, h;
Random r=new Random();

    public Shape() {
        setRandomColor();
        setRandomSize();
    }

    public void setRandomColor(){
        coolor = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
    }

    public void setRandomCoоrd(int windowX, int windowY){
        x=r.nextInt(windowX);
        y=r.nextInt(windowY);
    }

    public void setRandomSize(){
        w=r.nextInt(250);
        h=r.nextInt(250);
    }

    public Color getCoolor(){
        return coolor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
