package task12;

//Напишите тестовый класс, который создает массив класса Student и сортирует массив iDNumber вставками.

import java.lang.*;
import java.util.Arrays;

public class var1 {

    public static void sort(int[] idNumber)
    {
        System.out.println(Arrays.toString(idNumber));
        for (int left = 1; left < idNumber.length; left++) {
            int value = idNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < idNumber[i]) {
                    idNumber[i + 1] = idNumber[i];
                } else {
                    break;
                }
            }
            idNumber[i + 1] = value;
        }
        System.out.println(Arrays.toString(idNumber));
    }

    public static void main(String[] args)
    {
        Student[] stud = new Student[10];
        int[] idNumber = new int[stud.length];
        for (int i = 0; i < stud.length; i++)
        {
            int ranNum = (int) (1 + Math.random()*700);
            stud[i] = new Student(ranNum);
        }
        for(int i = 0; i < stud.length; i++)
        {
            idNumber[i] = stud[i].getId();
        }
        sort(idNumber);
    }
}

class Student
{
    private int id;
    public Student(int id) {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
}