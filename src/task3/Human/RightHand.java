package task3.Human;

public class RightHand {
    private int fingersCount;
    private char hair;
    public RightHand(int fingersCount, char hair){
        this.fingersCount=fingersCount;
        this.hair=hair;
    }

    public int getFingersCount() {
        return fingersCount;
    }

    public char getHair() {
        return hair;
    }

    public void setFingersCount(int fingersCount) {
        this.fingersCount = fingersCount;
    }

    public void setHair(char hair) {
        this.hair = hair;
    }

    public String toString() {
        return "LeftHand: fingersCount=" + fingersCount + ", hair=" + hair;
    }
}
