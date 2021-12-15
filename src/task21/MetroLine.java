package task21;

//Создайте класс со списком линий метро.
// Класс включает в себя метод, который называется PrintList с логическим параметром.
// Метод выводит на консоль нечетные или четные элементы списка, в зависимости от величины параметра (true или false).

import java.util.LinkedList;

public class MetroLine {
    LinkedList<String> stations;
    MetroLine(LinkedList<String> l){
        stations = l;
    }
    public void PrintList(Boolean bool){
        for(int i = 0; i < stations.size(); i++){
            if((bool) & (i % 2 == 1)) System.out.println(stations.get(i));
            else if((!bool) & (i % 2 == 0)) System.out.println(stations.get(i));
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        LinkedList<String> lines= new LinkedList<String>();
        lines.add("Sokolnicheskaya");
        lines.add("Zamoskvoreckaya");
        lines.add("Arbatsko-Pokrovskaya");
        lines.add("Filevskaya");
        lines.add("Kolcevaya");
        lines.add("Kalujsko-Rijskaya");
        lines.add("Tagansko-Krasnopresnenskaya");
        lines.add("Kalininskaya");
        lines.add("Serpuhovsko-Timiryazevskaya");
        lines.add("Liublinskaya");
        lines.add("Kahovskaya");
        lines.add("Butovskaya");
        MetroLine metro = new MetroLine(lines);
        metro.PrintList(false);
        metro.PrintList(true);
    }
}