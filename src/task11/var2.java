package task11;

//Реализуйте приложение, которое имеет макет границы и надписи для каждой области в макете.
//
//События мыши для описания действий:
//
//a. Когда мышь входит в CENTER, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);
//
//b. Когда мышь входит в WEST, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);
//
//c. Когда мышь входит в SOUTH, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);
//
//d. Когда мышь входит в в NORTH, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);
//
//e. Когда мышь входит в EAST, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]).

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class var2 extends JFrame {

    JLabel[] jLabels = {
            new JLabel("Добро пожаловать в Центр"),
            new JLabel("Добро пожаловать на Север"),
            new JLabel("Добро пожаловать на Юг"),
            new JLabel("Добро пожаловать на Запад"),
            new JLabel("Добро пожаловать на Восток"),
    };
    JPanel[] jPanels = { new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel(),};

    public var2() {
        super("Appobozik - 11.2");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500, 100);
        setLayout(new BorderLayout());

        add(jPanels[0], BorderLayout.CENTER);
        add(jPanels[1], BorderLayout.NORTH);
        add(jPanels[2], BorderLayout.SOUTH);
        add(jPanels[3], BorderLayout.WEST);
        add(jPanels[4], BorderLayout.EAST);
        for (int i = 0; i < jPanels.length; i++) {
            jLabels[i].setVisible(false);
            jPanels[i].add(jLabels[i]);
            int finalI = i;
            jPanels[i].addMouseListener(new MouseListener() {
                @Override public void mouseClicked(MouseEvent e) {}
                @Override public void mousePressed(MouseEvent e) {}
                @Override public void mouseReleased(MouseEvent e) {}
                @Override
                public void mouseEntered(MouseEvent e) {
                    jLabels[finalI].setVisible(true);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    jLabels[finalI].setVisible(false);
                }
            });
        }
    }

    public static void main (String[] args) {
        new var2();
    }
}
