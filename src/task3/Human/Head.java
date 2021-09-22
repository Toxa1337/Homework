package task3.Human;

public class Head {
    private String leftEyeColor, rightEyeColor, hairColor, hairType;
    public Head(String leftEyeColor, String rightEyeColor, String hairColor, String hairType){
        this.leftEyeColor=leftEyeColor;
        this.rightEyeColor=rightEyeColor;
        this.hairColor=hairColor;
        this.hairType=hairType;
    }

    public String getLeftEyeColor() {
        return leftEyeColor;
    }

    public String getRightEyeColor() {
        return rightEyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getHairType() {
        return hairType;
    }

    public void setLeftEyeColor(String leftEyeColor) {
        this.leftEyeColor = leftEyeColor;
    }

    public void setRightEyeColor(String rightEyeColor) {
        this.rightEyeColor = rightEyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public String toString() {
        return "Head: " + "leftEyeColor=" + leftEyeColor + '\'' + ", rightEyeColor='" + rightEyeColor + '\'' + ", hairColor='" + hairColor + '\'' + ", hairType='" + hairType + '\'';
    }
}
