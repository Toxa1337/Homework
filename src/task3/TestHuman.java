package task3;

import task3.Human.*;

public class TestHuman {
    public static void main(String[] args) {
        Human d1 = new Human("Anton", "Smirnov", 19, 1.87, 78, 'M', "A+");
        Head d2 = new Head("brown","brown","brown","Short");
        Body d3 = new Body(84.3, 73.4, 83.8,'Y');
        LeftHand d4 = new LeftHand(5, 'Y');
        RightHand d5 = new RightHand(5, 'Y');
        LeftLeg d6 = new LeftLeg(5, 45, 'Y');
        RightLeg d7 = new RightLeg(5, 45, 'Y');
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        d2.setHairType("Long");
        System.out.println(d2);
    }
}
