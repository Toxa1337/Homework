package task8.var1;

import task8.var1.fig.Hexagon;
import task8.var1.fig.Oval;
import task8.var1.fig.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    Random r = new Random();
    public static void main(String[] argc) {
        Window window = new Window();

        window.setSize(1500, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить работу программу при закрытии окна
        window.setVisible(true);
    }
    public Window() {
        super("RandromFigure");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i=0; i<20; i++){
            switch (r.nextInt(3)+1) {
                case 1:
                    Oval o = new Oval(getWidth(), getHeight());
                    o.draw(g);
                    break;
                case 2:
                    Rectangle r = new Rectangle(getWidth(), getHeight());
                    r.draw(g);
                    break;
                case 3:
                    Hexagon h = new Hexagon(getWidth(),getHeight());
                    h.draw(g);
                    break;
            }

        }
    }
}
