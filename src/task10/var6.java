package task10;

 //Проверка числа на простоту. Дано натуральное число n>1. Проверьте, является ли оно простым.
// Программа должна вывести слово YES, если число простое и NO, если число составное.
// Алгоритм должен иметь сложность O(logn).
// Указание. Понятно, что задача сама по себе нерекурсивна,
// т.к. проверка числа n на простоту никак не сводится к проверке на простоту меньших чисел.
// Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно по этому параметру и делать рекурсию.


import java.util.Scanner;

public class var6 {
    protected int N,n=2;
    protected boolean answ=true;

    var6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        setN(scan.nextInt());
    }

    public void setN(int n) {
        N = n;
    }

    public void recursNat(){
        while(n!=N){

            if (N % n != 0){
                n+=1;
                recursNat();
            }else {
                answ=false;
                n=N;
            }
        }
    }

    public String answer(){
        if(answ==true){
            return("YES");
        }else{
            return ("NO");
        }
    }

    public static void main(String[] args) {
    var6 natur = new var6();
    natur.recursNat();
    System.out.println('\n'+"Natural number: "+natur.answer());
    }
}
