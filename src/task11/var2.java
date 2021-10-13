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

public class var2 {
    private JLabel t;
    private JFrame window;

    public void field(){

        JLabel center = new JLabel();
        center.setBounds(window.getWidth()/4,window.getHeight()+55/4,100,100);
        center.setBackground(Color.decode("#00FF00"));
        center.setOpaque(true);


        JLabel east = new JLabel();
        east.setBounds(window.getWidth()-15,70,15,window.getHeight()-70);
        east.setBackground(Color.decode("#FF5511"));
        east.setOpaque(true);

        JLabel west = new JLabel();
        west.setBounds(0,70,15,window.getHeight()-70);
        west.setBackground(Color.decode("#FF0000"));
        west.setOpaque(true);

        JLabel north = new JLabel();
        north.setBounds(15,55,window.getWidth()-15,15);
        north.setBackground(Color.decode("#00FFFF"));
        north.setOpaque(true);

        JLabel south = new JLabel();
        south.setBounds(15,window.getHeight()-15,window.getWidth()-15,15);
        south.setBackground(Color.decode("#FFFF00"));
        south.setOpaque(true);

        window.add(center);
        window.add(north);
        window.add(south);
        window.add(west);
        window.add(east);
    }

    public void dialog(JLabel x){
        t=x;
    }
    public void window(JFrame x){
        window=x;
    }

    public static void main(String[] args) {
        var2 x = new var2();

        JFrame window = new JFrame("Text");

        window.setSize(1000, 800);
        window.setLocation(500,0);

        JLabel textField = new JLabel();
        textField.setBounds(0,0,window.getWidth()-15,55);
        textField.setBackground(Color.DARK_GRAY);
        textField.setOpaque(true);
        x.dialog(textField);
        window.add(textField);

        JLabel center = new JLabel();
        center.setBounds(435,340,100,100);
        center.setBackground(Color.decode("#00FF00"));
        center.setOpaque(true);



        JLabel east = new JLabel();
        east.setBounds(window.getWidth()-30,70,15,window.getHeight()-120);
        east.setBackground(Color.decode("#FF5511"));
        east.setOpaque(true);

        JLabel west = new JLabel();
        west.setBounds(0,70,15,window.getHeight()-120);
        west.setBackground(Color.decode("#FF0000"));
        west.setOpaque(true);

        JLabel north = new JLabel();
        north.setBounds(0,55,window.getWidth()-15,15);
        north.setBackground(Color.decode("#00FFFF"));
        north.setOpaque(true);

        JLabel south = new JLabel();
        south.setBounds(0,window.getHeight()-50,window.getWidth()-15,15);
        south.setBackground(Color.decode("#FFFF00"));
        south.setOpaque(true);

        window.add(center);
        window.add(north);
        window.add(south);
        window.add(west);
        window.add(east);


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить работу программу при закрытии окна
        window.setLayout(null);
        window.setVisible(true);
    }

}
