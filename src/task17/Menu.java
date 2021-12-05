package task17;
import task17.Planets;

import java.util.Scanner;

//Добавьте в программу меню,
// в результате работы которого пользователь сможет узнать силу притяжения для выбранной им планеты.

public class Menu {

    private double m=1;

    String getF(Planets.Planet planet){

        return "F = "+ ((planet.getGM()*m)/planet.getR2()) + "Н";

    }

    public boolean Interface(){
        int ch = 0;
        boolean e=false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose planet:\n");
        System.out.println("1 - Mercury\n");
        System.out.println("2 - Venus\n");
        System.out.println("3 - Earth\n");
        System.out.println("4 - Mars\n");
        System.out.println("5 - Jupiter\n");
        System.out.println("6 - Saturn\n");
        System.out.println("7 - Uranus\n");
        System.out.println("8 - Neptune\n");
        System.out.println("0 - Exit\n");

        ch= scanner.nextInt();

        switch (ch){
            case 1: System.out.println(getF(Planets.Planet.Mercury)); break;
            case 2: System.out.println(getF(Planets.Planet.Venus)); break;
            case 3: System.out.println(getF(Planets.Planet.Earth)); break;
            case 4: System.out.println(getF(Planets.Planet.Mars)); break;
            case 5: System.out.println(getF(Planets.Planet.Jupiter)); break;
            case 6: System.out.println(getF(Planets.Planet.Saturn)); break;
            case 7: System.out.println(getF(Planets.Planet.Uranus)); break;
            case 8: System.out.println(getF(Planets.Planet.Neptune)); break;
            case 0: e=true; break;
            default: System.out.println("Error"); break;
        }
        return e;
    }

    public static void main(String[] args) {
        Menu u = new Menu();
        boolean exit=false;
        while (!exit){
            exit= u.Interface();
        }
    }

}
