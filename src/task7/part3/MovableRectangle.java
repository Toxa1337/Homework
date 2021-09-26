package task7.part3;

import task7.part2.Movable;
import task7.part2.MovablePoint;

public class MovableRectangle implements Movable {

    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
    if (topLeft.ySpeed==bottomRight.ySpeed){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    }

    @Override
    public void moveDown() {
        if (topLeft.ySpeed==bottomRight.ySpeed){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (topLeft.xSpeed==bottomRight.xSpeed){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (topLeft.xSpeed==bottomRight.xSpeed){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
