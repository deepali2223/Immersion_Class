package Class_Question.Recursion;

import java.util.Scanner;

public class GCD_Of_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gcdOfFact(Math.min(n,m)));
    }

    private static int gcdOfFact(int n) {
        if(n == 0){
            return 1;
        }
        return n* gcdOfFact(n-1);
    }
}
