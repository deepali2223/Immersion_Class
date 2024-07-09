package Assignment.Assignment_3;

import java.util.Scanner;

public class Sum_Of_Natural_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }

    private static int printSum(int n) {
        if(n == 1){
            return 1;
        }
        return n+ printSum(n-1);
    }
}
