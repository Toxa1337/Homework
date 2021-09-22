package task3.Human;

public class Human {
    private String name, surname;
    private int age, weight;
    double height;
    private String bloodType;
    private char gender;

    public Human(String name, String surname, int age, double height, int weight, char gender, String bloodType){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.gender=gender;
        this.bloodType=bloodType;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String toString() {
        return "Human:" + "name=" + name + ", surname='" + surname + '\'' + ", age=" + age + ", height=" + height + ", weight=" + weight + ", bloodType='" + bloodType + '\'' + ", gender=" + gender + '}';
    }
}
