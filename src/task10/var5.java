package task10;

import java.util.Scanner;

public class var5 {
    private int sum=0,N;

    var5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Natural number: ");
        setN(scan.nextInt());
    }

    public void setN(int n) {
        N = n;
    }

    public void recursMod(){
        while(N>0){
            sum+=N % 10;
            N=N/10;
            recursMod();
        }
    }

    public static void main(String[] args) {
        var5 summ = new var5();
        summ.recursMod();
        System.out.println('\n'+"Number summ: "+summ.sum);
    }

}
