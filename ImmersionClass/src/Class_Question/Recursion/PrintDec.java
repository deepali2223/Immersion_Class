package Class_Question.Recursion;

import java.util.Scanner;

public class PrintDec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDec(n);
    }

    private static void printDec(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
}
