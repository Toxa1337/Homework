package task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RonaldinhoSoccer64 extends JFrame {

    protected int n1=0, n2=0;
    protected String team1="Milan", team2="Real Madrid";

    public void label1(JLabel res, RonaldinhoSoccer64 win){

        res.setText("Result: "+ String.valueOf(win.n1) + "X" + String.valueOf(win.n2));

    }

    public void label2(JLabel res, RonaldinhoSoccer64 win){

        res.setText("Result: "+ String.valueOf(win.n1) + "X" + String.valueOf(win.n2));

    }

    public static void main(String[] argc) {

        RonaldinhoSoccer64 window = new RonaldinhoSoccer64();

        window.setSize(1000, 800);
        window.setLocation(20,10);

        JButton button1 = new JButton("Team1: "+window.team1);
        button1.setBounds(window.getWidth()/4,100, 200, 55);
        window.add(button1);

        JButton button2 = new JButton("Team2: "+window.team2);
        button2.setBounds((window.getWidth()-90)*3/4, 100, 200, 55);
        window.add(button2);

        JButton button3 = new JButton("END");
        button3.setBounds(window.getWidth()/2, 180, 115, 55);
        window.add(button3);

        JLabel result = new JLabel("Result: "+ String.valueOf(window.n1) + "X" + String.valueOf(window.n2));
        result.setBounds(window.getWidth()/2,window.getHeight()/2,150,50);
        result.setFont(new Font("Times New Roman",Font.ITALIC,15));
        window.add(result);

        JLabel lastScorer = new JLabel("Last Scorer: N/A");
        lastScorer.setBounds(window.getWidth()/2,window.getHeight()*2/5,150,50);
        lastScorer.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,15));
        window.add(lastScorer);

        Label winner = new Label("Winner: DRAW");
        winner.setBounds(window.getWidth()/2,window.getHeight()*3/5,200,80);
        winner.setFont(new Font("Times New Roman",Font.BOLD,15));
        window.add(winner);

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                window.n1 += 1;
                result.setText("Result: "+ String.valueOf(window.n1) + "X" + String.valueOf(window.n2));
                lastScorer.setText("Last Scorer: "+window.team1);
            }
        });

        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                window.n2 += 1;
                result.setText("Result: "+ String.valueOf(window.n1) + "X" + String.valueOf(window.n2));
                lastScorer.setText("Last Scorer: "+window.team2);
            }
        });

        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(window.n1>window.n2){
                    winner.setText("Winner: "+window.team1);
                }else{ if(window.n1<window.n2) {
                    winner.setText("Winner: " + window.team2);
                }else{
                    winner.setText("Winner: Friendship");
                }
                }
            }
        });

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить работу программу при закрытии окна
        window.setLayout(null);
        window.setVisible(true);
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        result.setVisible(true);
        lastScorer.setVisible(true);
        winner.setVisible(true);

    }
    public RonaldinhoSoccer64() {
        super("HA-HA-HA-HA-HA-HA-HA-RonaldinhoSoccer64");
    }
}