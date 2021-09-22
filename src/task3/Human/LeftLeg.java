package task3.Human;

public class LeftLeg {
    private int fingersCount, shoeSize;
    private char hair;

    public LeftLeg(int fingersCount, int shoeSize, char hair){
        this.fingersCount=fingersCount;
        this.shoeSize=shoeSize;
        this.hair=hair;
    }

    public int getFingersCount() {
        return fingersCount;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public char getHair() {
        return hair;
    }

    public void setFingersCount(int fingersCount) {
        this.fingersCount = fingersCount;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setHair(char hair) {
        this.hair = hair;
    }

    public String toString() {
        return "RightLeg: fingersCount=" + fingersCount + ", shoeSize=" + shoeSize + ", hair=" + hair;
    }
}
