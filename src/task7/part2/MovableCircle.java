package task7.part2;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public void moveUp(int ySpeed) {
        if (ySpeed>0){
            center.ySpeed=ySpeed;
        }else{
            moveDown(ySpeed);
        }
    }

    @Override
    public void moveDown(int ySpeed) {
        if (ySpeed<0){
            center.ySpeed=ySpeed;
        }else{
            moveUp(ySpeed);
        }
    }

    @Override
    public void moveLeft(int xSpeed) {
        if (xSpeed<0){
            center.xSpeed=xSpeed;
        }else{
            moveRight(xSpeed);
        }
    }

    @Override
    public void moveRight(int xSpeed) {
        if (xSpeed>0){
            center.xSpeed=xSpeed;
        }else{
            moveLeft(xSpeed);
        }
    }
}
