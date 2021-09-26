package task7;

import task7.part2.Movable;
import task7.part2.MovableCircle;
import task7.part2.MovablePoint;
import task7.part3.MovableRectangle;

public class TestMovable {

        public static void main(String[] args) {

            Movable point = new MovablePoint(6, 2, 5, 14);
            Movable circle = new MovableCircle(9, -7, 1, 3, 15);
            Movable rectangle = new MovableRectangle(2,7,8,4, 11,3);

            System.out.println(point);
            point.moveDown();
            point.moveLeft();
            point.moveUp();
            System.out.println(point);

            System.out.println(circle);
            circle.moveUp();
            circle.moveRight();
            circle.moveRight();
            System.out.println(circle);

            System.out.println(rectangle);
            rectangle.moveDown();
            rectangle.moveRight();
            rectangle.moveDown();
            System.out.println(rectangle);

        }
}
