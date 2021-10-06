package task8.var1.fig;

import task8.var1.Shape;
import java.awt.Polygon;
import java.awt.*;

public class Hexagon extends Shape {
    private Polygon poly;
    public Hexagon(int x, int y){
        super();
        setRandomCoоrd(x,y);
    }

    public void draw(Graphics g){
        g.setColor(Color.decode("#e3256b"));
        int xPoly[] = {150,250,325,375,450,275,100};
        int yPoly[] = {150,100,125,225,250,375,300};
        poly = new Polygon(xPoly, yPoly, xPoly.length);
        g.drawPolygon(poly);
        g.setColor(getCoolor());
        g.fillPolygon(poly);
    }

    @Override
    public void setRandomCoоrd(int windowX, int windowY) {
        super.setRandomCoоrd(windowX, windowY);
    }
}
