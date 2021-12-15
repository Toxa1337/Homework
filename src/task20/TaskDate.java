package task20;

//Напишите программу, выводящую фамилию разработчика, дату и время получения задания,
// а также дату и время сдачи задания.
// Для получения последней даты и времени используйте класс Date из пакета java.util.

import java.util.Date;
import java.util.Objects;

public class TaskDate {
    public static void main(String[] args){
        Student student1 = new Student("Anton", "Wed Feb 2 13:37:28 MSK 2021");

        System.out.println(student1);

        student1.setFinishDate();

        System.out.println(student1);
    }
}

class Student{
    private String name;
    private String startDate;
    private String finishDate = "-1";

    Student(String name, String startDate){
        this.name = name;
        this.startDate = startDate;
    }

    public void setFinishDate() {
        Date date = new Date();
        this.finishDate = date.toString();
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinishDate() {
        if (!Objects.equals(finishDate, "-1")){
            return finishDate;
        }
        else {
            return "Not done.";
        }
    }

    public String toString(){
        String text = "Student: " + getName() + "\nTask got: " + getStartDate();
        text += "\nTask done: " + getFinishDate();
        return text;
    }
}