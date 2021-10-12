package task11;

//Реализуйте игру-угадайку, которая имеет одно текстовое поле и одну кнопку.
//
//Игра предлагает пользователю угадать число между 0 и 20 и дает ему три попытки.
//
//a. Если пользователю не удаётся угадать, то выводится сообщение о том,
// что пользователь допустил ошибку - число должно быть меньше или больше в зависимости от ситуации.
//
//b. Если пользователь попытался угадать три раза - Game over.
//
//c. Если пользователь угадал, то программа поздравляет пользователя с победой.

import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class var1 extends JFrame {

    private int number, guess, tr=3;

    public int compare(){
        if(number>guess){
            return 1;
        }else{if(number<guess){
            return -1;
        }else{ return 0;}
        }
    }

    public static void main(String[] argc) {

        var1 window = new var1();

        window.setSize(800, 750);
        window.setLocation(200,10);

        JTextField textField = new JTextField(2);
        textField.setToolTipText("Really hard ( ˘︹˘ )");
        textField.setFont(new Font("Dialog", Font.PLAIN, 14));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setBounds((window.getWidth()/2)-100,215,200,55);
        textField.addActionListener(new TextAction("") {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.guess = Integer.valueOf(textField.getText());
            }
        });
        window.add(textField);

        Label result = new Label("Let's try!");
        result.setBounds((window.getWidth()/2)-100,100,200,80);
        result.setFont(new Font("Times New Roman",Font.BOLD,15));
        window.add(result);


        JButton button1 = new JButton("Try");
        button1.setBounds((window.getWidth()/2)-100,300, 200, 55);
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (window.tr==0){
                    result.setText("YOU LOSE! ╯︿╰");
                } else {
                    switch (window.compare()) {
                        case 1:
                            result.setText("Your number is less!");
                            window.tr -= 1;
                            break;
                        case -1:
                            result.setText("Your number is bigger!");
                            window.tr -= 1;
                            break;
                        case 0:
                            result.setText("You WIN!!!");
                            window.tr = 4;
                            break;
                    }
                }
            }
        });
        window.add(button1);

        JButton button2 = new JButton("New Game");
        button2.setBounds((window.getWidth()/2)-100,365, 200, 55);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                window.number=random.nextInt(21);
                result.setText("Let's try again!");
                window.tr=3;
            }
        });
        window.add(button2);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить работу программу при закрытии окна
        window.setLayout(null);
        window.setVisible(true);
    }
    public var1() {
        super("Fix the odds (╬▔皿▔)╯");
    }
}
