package Assignment.Assignment_1;

import java.util.Scanner;

public class Smallest_No_Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findSmallestNo(n,k));
    }

    private static long findSmallestNo(int n, int k) {
        long power = (long)Math.pow(10,k);
        long g = gcd(power,n);
        return power*n / g;
    }
    private static long gcd(long a,int b){
        while(a>0 && b>0){
            if(a>b){
                a %= b;
            }
            else if(b>a) {
                b %= a;
            }
        }
        return a==0?b:a;
    }
}
