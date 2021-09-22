package task2;

public class Veterinary {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", 2);
        Dog d2 = new Dog("Helen");
        Dog d3 = new Dog();
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
