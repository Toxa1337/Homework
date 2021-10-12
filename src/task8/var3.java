package task8;

import javax.swing.*;
import java.util.Scanner;
public class var3 {
    public static void main(String[] argc) {
        String[] path = new String[8];
        Scanner scan = new Scanner(System.in);
        JFrame frame = new JFrame("PictureFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        for (int i = 0; i < 8; i++)
        {
            //path[i] = scan.nextLine();
            path[i]="C:\\Users\\Антон\\Desktop\\Anim\\"+String.valueOf(i)+".jpg";
        }

        while(true) {
            for (int i = 0; i < path.length; i++) {
                ImageIcon img = new ImageIcon(path[i]);
                JLabel label = new JLabel(img);
                frame.add(label);
                frame.setVisible(true);
                try {
                    Thread.sleep(100);
                } catch(InterruptedException ex) {}
                frame.getContentPane().removeAll();
            }
        }
    }
}
