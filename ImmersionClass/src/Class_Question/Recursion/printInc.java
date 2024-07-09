package Class_Question.Recursion;

import java.util.Scanner;

public class printInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       printIn(n);
    }

    private static void printIn(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);//when stack grow
        printIn(n-1);
        System.out.println(n);// when stack decreses

    }
}
