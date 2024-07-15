package Class_Question.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInst(n,1,2,3);
    }

    private static void printInst(int n,int a,int b,int c) {
        if(n==0){
            return;
        }
        printInst(n-1,a,c,b);
        System.out.println("Move ring "+n+" from tower "+a+"to "+b);
        printInst(n-1,c,b,a);
    }
}
