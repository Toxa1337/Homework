package task8.var1.fig;

import task8.var1.Shape;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(int x, int y){
        super();
        setRandomCoоrd(x,y);
    }

    public void draw(Graphics g){
        g.setColor(Color.decode("#e3256b"));
        g.drawRect(getX(),getY(),getW(),getH());
        g.setColor(getCoolor());
        g.fillRect(getX()+1,getY()+1,getW()-2,getH()-2);
    }

    @Override
    public void setRandomCoоrd(int windowX, int windowY) {
        super.setRandomCoоrd(windowX, windowY);
    }
}
