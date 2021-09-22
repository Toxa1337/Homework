package task4;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball(20.5, 13.4);
        Ball d2 = new Ball();
        System.out.println(d1);
        System.out.println(d2);
        d2.setX(1);
        System.out.println(d2.getX());
        d1.move(16.7, -13.3);
        d2.move(-1.0,-19.3);
        System.out.println(d1);
        System.out.println(d2);
    }
}
