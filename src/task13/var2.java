package task13;

//Протестируйте работу коллекции LinkedList

import java.util.LinkedList;

public class var2 {

    public static void output(LinkedList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("\n");
    }

        public static void main(String[] args) {

            LinkedList<String> chain = new LinkedList<>();

            chain.add("A");
            chain.add("B");
            chain.add("C");
            chain.add("D");
            chain.add("E");
            chain.add("F");
            chain.add("G");
            chain.add("H");
            output(chain);

            chain.remove(6);
            output(chain);

            System.out.println("Индекс звена H: " + chain.indexOf("H"));
            System.out.println("\n");

            System.out.println(chain.contains("G"));
            System.out.println("\n");

            chain.set(6, "New G");
            output(chain);

            System.out.println(chain.pollFirst());
            System.out.println("\n");

            System.out.println(chain.pollLast());
            System.out.println("\n");
            output(chain);

            chain.clear();
            System.out.println("Размер цепи: " + chain.size());
        }
}
