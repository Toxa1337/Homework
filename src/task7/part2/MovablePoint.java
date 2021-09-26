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
    public void moveUp(int ySpeed) {
    if (ySpeed>0){
        this.ySpeed=ySpeed;
    }else{
        moveDown(ySpeed);
    }
    }

    @Override
    public void moveDown(int ySpeed) {
        if (ySpeed<0){
            this.ySpeed=ySpeed;
        }else{
            moveUp(ySpeed);
        }
    }

    @Override
    public void moveLeft(int xSpeed) {
        if (xSpeed<0){
            this.xSpeed=xSpeed;
        }else{
            moveRight(xSpeed);
        }
    }

    @Override
    public void moveRight(int xSpeed) {
        if (xSpeed>0){
            this.xSpeed=xSpeed;
        }else{
            moveLeft(xSpeed);
        }
    }
}
