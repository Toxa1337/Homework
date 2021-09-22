package task5.num2;

public abstract class Dog {
    private String name, fur, character, category;
    private int age;

    public Dog(String name, String fur, String character, String category, int age){
        this.name=name;
        this.fur=fur;
        this.character=character;
        this.category=category;
        this.age=age;
    }

    public String getInfo(){
        return "name: "+name+", fur: "+fur+", character: "+character+", category: "+category+", age: "+age;
    }

    public abstract String getBreed();


    public String intoHumanAge(){ return (this.name+"'s age in human years is "+this.age*7+" years");}
    public abstract String toString();
}
