package Class_Question.Recursion;

import java.util.Scanner;

public class SumOfDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    private static int sum(int n){
        if(n == 0){
            return 0;
        }
        int rem = n % 10;
        return rem+ sum(n/10);
    }
}
