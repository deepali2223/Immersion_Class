package Assignment.Assignment_1;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
    }
    static String armstrongNumber(int m){
        // code here
        int n = m;
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum += r*r*r;
            n /=10;
        }
        if(sum == m){
            return "Yes";
        }
        else return "No";
    }
}
