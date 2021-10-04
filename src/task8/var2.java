package task8;

import javax.swing.*;

public class var2 {

    public static void main(String[] argc) {
        String imageFile ="";
        if (argc.length > 0) {
            for(int i = 0; i <argc.length; i++)
                imageFile += argc[i];
        }

        JFrame window = new JFrame("ImageWindow");
        ImageIcon img = new ImageIcon("C:\\Users\\Антон\\Desktop\\f3fa7ec72c62ecf057ef73f3d1dc0146.gif");//сюда нужно поместить путь к файлу
        JLabel label = new JLabel(img);
        window.add(label);

        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить работу программу при закрытии окна
        window.setVisible(true);// картинку нужно видеть


    }
}
