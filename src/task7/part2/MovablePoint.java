package task7.part2;

public class MovablePoint implements Movable {
    public int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "Object: MovablePoint, x:"+this.x+", xSpeed:"+this.xSpeed+", y:"+this.y+", ySpeed:"+this.ySpeed;
    }

    @Override
    public void moveUp() {
    y=y+ySpeed;
    }

    @Override
    public void moveDown() {
    y=y-ySpeed;
    }

    @Override
    public void moveLeft() {
    x=x-xSpeed;
    }

    @Override
    public void moveRight() {
    x=x+xSpeed;
    }

}
