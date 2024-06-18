package Class_Question.Recursion;

import java.util.Scanner;

public class SumOfNNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n == 0){
            return 0;
        }
        System.out.println(n);
        int small = sum(n-1);
        System.out.println(n);
        return  n + small;
    }
}
