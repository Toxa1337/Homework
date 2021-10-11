package task10;

import java.util.Scanner;

public class var8 {

    private String word;
    private boolean check=true;
    private int q=1;

    var8() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Word: ");
        word=scan.nextLine();
    }

    public void recurs() {

        while (q != word.length() / 2) {
            char c1 = word.charAt(q);
            char c2 = word.charAt(word.length()-q-1);
            if( Character.compare(c1,c2)==0){
                q+=1;
                recurs();
            }else{
                check=false;
                q=word.length() / 2;
            }

        }
    }

    public String answer(){
        if(check==true){
            return ("YES");
        }else{
            return ("NO");
        }
    }

    public static void main(String[] args) {
        var8 pol = new var8();
        pol.recurs();
        System.out.println("Poly: "+pol.answer());
    }
}
