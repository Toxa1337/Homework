package task12;

//Напишите программу, которая объединяет два списка данных о студентах
//в один отсортированный списках с использованием алгоритма сортировки слиянием.

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

class StudentsData
{
    private double GPA;
    private int id;
    private String name;
    public StudentsData(String name, double GPA, int id) {
        this.name = name;
        this.GPA = GPA;
        this.id = id;
    }

    public double getGPA()
    {
        return GPA;
    }
    public int getID() { return id; }
    public String getName() { return name; }
    public String toString()
    {
        return "Name: " + this.name +"; GPA: "+ this.GPA + "; ID: " + this.id;
    }

}


public class var3 {

    private ArrayList<StudentsData> strList;
    private int sortingParameter;

    public var3(ArrayList<StudentsData> input, int sortingParameter) {
        strList = input;
        this.sortingParameter = sortingParameter;
    }

    public void sort() {
        strList = mergeSort(strList);
    }

    public ArrayList<StudentsData> mergeSort(ArrayList<StudentsData> whole) {
        ArrayList<StudentsData> left = new ArrayList<>();
        ArrayList<StudentsData> right = new ArrayList<>();
        int center;

        if (whole.size() == 1) {
            return whole;
        } else {
            center = whole.size()/2;
            for (int i=0; i<center; i++) {
                left.add(whole.get(i));
            }

            for (int i=center; i<whole.size(); i++) {
                right.add(whole.get(i));
            }

            left  = mergeSort(left);
            right = mergeSort(right);

            merge(left, right, whole, sortingParameter);

        }
        return whole;
    }

    private void merge(ArrayList<StudentsData> left, ArrayList<StudentsData> right, ArrayList<StudentsData> whole, int sortingParameter) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        switch(sortingParameter)
        {
            case 1:
            {
                while (leftIndex < left.size() && rightIndex < right.size()) {
                    if ( left.get(leftIndex).getID() < (right.get(rightIndex).getID())) {
                        whole.set(wholeIndex, left.get(leftIndex));
                        leftIndex++;
                    } else {
                        whole.set(wholeIndex, right.get(rightIndex));
                        rightIndex++;
                    }
                    wholeIndex++;
                }
                break;
            }

            case 2:
            {
                while (leftIndex < left.size() && rightIndex < right.size()) {
                    if ( left.get(leftIndex).getGPA() < (right.get(rightIndex).getGPA())) {
                        whole.set(wholeIndex, left.get(leftIndex));
                        leftIndex++;
                    } else {
                        whole.set(wholeIndex, right.get(rightIndex));
                        rightIndex++;
                    }
                    wholeIndex++;
                }
                break;
            }

            case 3:
            {
                while (leftIndex < left.size() && rightIndex < right.size()) {
                    if ( (left.get(leftIndex).getName().compareTo(right.get(rightIndex).getName())) < 0) {
                        whole.set(wholeIndex, left.get(leftIndex));
                        leftIndex++;
                    } else {
                        whole.set(wholeIndex, right.get(rightIndex));
                        rightIndex++;
                    }
                    wholeIndex++;
                }
                break;
            }

            default:
            {
                System.out.println("Error, wrong input");
                exit(1);
            }
        }

        ArrayList<StudentsData> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }

        for (int i=restIndex; i<rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }


    public void show() {
        System.out.println("Sorted:");
        for (int i=0; i< strList.size();i++) {
            System.out.println(strList.get(i).toString());
        }
    }


    public static void main (String[] args)
    {
        ArrayList<StudentsData> list1 = new ArrayList<>();
        ArrayList<StudentsData> list2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Антон"); names.add("Михаил"); names.add("Дмитрий"); names.add("Владимир"); names.add("Степан");
        names.add("Олег"); names.add("Константин"); names.add("Вячеслав"); names.add("Алексей"); names.add("Егор");

        for (int i = 0; i < 10; i++)
        {
            int nameNum = (int)(0 + Math.random()*(names.size()-1));
            double GPANum = (2 + Math.random()*3);
            GPANum = (double)Math.round(GPANum * 100d) / 100d;
            int IDNum = (int)(1+Math.random()*5000);
            StudentsData student = new StudentsData(names.get(nameNum), GPANum, IDNum);
            names.remove(nameNum);
            if (i % 2 == 0)
            {
                list1.add(student);
            }
            else
            {
                list2.add(student);
            }
        }


        for(int i = 0; i < 5; i++)
        {
            System.out.println(list1.get(i).toString());
        }
        System.out.println("\n");

        for(int i = 0; i < 5; i++)
        {
            System.out.println(list2.get(i).toString());
        }

        list1.addAll(list2);
        System.out.println("Выберете параметр сортировки:\n 1 -- ID\n 2 -- Средний балл\n 3 -- Имя\n");
        var3 test = new var3(list1,scan.nextInt());
        test.sort();
        test.show();

    }
}