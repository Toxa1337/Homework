package task11;

//Реализуйте приложение с JTextArea и двумя меню:
//
//Цвет: предусмотрена возможность выбора одного из трёх заданных разработчиком цветов,
//
//Шрифт: предусмотрена возможность выбора одного из трёх заданных разработчиком шрифтов.
//
//Нужно написать программу, которая с помощью меню может изменять шрифт и цвет текста, написанного пользователем в JTextArea.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class var3 extends JFrame {

    protected String f="Times New Roman";
    protected Font c= new Font(f,Font.PLAIN,15);
    protected int n=0;
    protected JTextField t;

    public void setF(){
        switch (n){
            case 0: c=new Font(f,Font.PLAIN,15); break;
            case 1: c=new Font(f,Font.BOLD,15); break;
            case 2: c=new Font(f,Font.ITALIC,15); break;
        }
        t.setFont(c);
    }

    public JMenuBar textMenu(){

        JMenu text = new JMenu("Текст");
        JMenu font = new JMenu("Шрифт");
        JMenuItem times = new JMenuItem("Times New Roman");
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f="Times New Roman";
                setF();
            }
        });
        JMenuItem arial = new JMenuItem("Arial");
        arial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f="Arial";
                setF();
            }
        });
        JMenuItem simple = new JMenuItem("Обычный");
        simple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n=0;
                setF();
            }
        });
        JMenuItem bold = new JMenuItem("Жирный");
        bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n=1;
                setF();
            }
        });
        JMenuItem italic = new JMenuItem("Курсив");
        italic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n=2;
                setF();
            }
        });


        JMenu color = new JMenu("Цвет");
        JMenuItem black = new JMenuItem("Чёрный");
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setForeground(Color.decode("#000000"));
            }
        });
        JMenuItem red = new JMenuItem("Красный");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setForeground(Color.decode("#AA0000"));
            }
        });
        JMenuItem green = new JMenuItem("Зелёный");
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setForeground(Color.decode("#00AA00"));
            }
        });
        JMenuItem blue = new JMenuItem("Синий");
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setForeground(Color.decode("#0000AA"));
            }
        });

        text.add(font);
        font.add(times);
        font.add(arial);
        font.addSeparator();
        font.add(simple);
        font.add(bold);
        font.add(italic);
        text.add(color);
        color.add(black);
        color.add(red);
        color.add(green);
        color.add(blue);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(text);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.setVisible(true);

        return menuBar;

    }

    public void textField(JTextField t){
        this.t=t;
    }

    public JFrame window(){
        JFrame window = new JFrame("Text");
        window.setSize(1000, 800);
        window.setLocation(20,10);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить работу программу при закрытии окна
        window.setLayout(null);
        window.setVisible(true);
        return (window);
    }

    public static void main(String[] args) {

        var3 x = new var3();

        JFrame window = new JFrame("Text");

        window.setSize(1000, 800);
        window.setLocation(20,10);

        window.setJMenuBar(x.textMenu());

        JTextField textField = new JTextField();
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setBounds((window.getWidth()/2)-100,215,200,55);
        window.add(textField);
        x.textField(textField);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить работу программу при закрытии окна
        window.setLayout(null);
        window.setVisible(true);
    }
}
