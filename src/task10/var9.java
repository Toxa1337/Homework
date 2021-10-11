package task10;

//Без двух нулей. Даны числа a и b. Определите, сколько существует последовательностей из a нулей и b единиц,
// в которых никакие два нуля не стоят рядом.

import java.util.Scanner;

public class var9 {
    private int a,b,numb, answer;

    var9(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zero number: ");
        a=scan.nextInt();
        System.out.println("Units number: ");
        b=scan.nextInt();
        numb=a+b;
    }

    public void combinations(int x, int q1, int q2,int q3){
        int signal=0;
        while (true){
            if(x==1){
                if (a-q1!=0) {
                    combinations(0,q1+1,q2,q3+1);
                }else{signal+=1;}
                if(b-q2!=0) {
                    combinations(1,q1,q2+1, q3+1);
                }else{signal+=1;}
            }else {
                if (b - q2 != 0) {
                    combinations(1, q1, q2 + 1,q3+1);
                }else {signal+=2;}
            }
            if ((signal==2)&&(q3==numb)){
                answer +=1;
            }
            break;
        }
    }

    public static void main(String[] args) {
        var9 comb = new var9();
        comb.combinations(0,1,0,1);
        comb.combinations(1,0,1,1);
        System.out.println("Combinations: "+comb.answer);
    }

}
