package task10;


import java.util.Scanner;

public class var7 {
    protected int N,q=2, n = 2;
    protected String answ = "1, ";
    protected boolean check = true;

    var7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        setN(scan.nextInt());
    }

    public void setN(int n) {
        N = n;
    }

    public void recursNat(int x) {
        while (n != x) {
            if (x % n != 0) {
                n += 1;
                recursNat(x);
            } else {
                n = x;
                check=false;
            }
        }
    }

    public void natural(){
        while (q!=N+1){
            recursNat(q);
            if (check==true){
                answ=answ+q+", ";
            }
            n=2;
            check=true;
            q+=1;
        }
    }

    public String answer() {
        return answ;
    }

    public static void main(String[] args) {
        var7 natur = new var7();
        natur.natural();
        System.out.println('\n' + "Natural multipliers: " + natur.answer());
    }
}