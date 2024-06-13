package Assignment.Assignment_1;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        //1534236469
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE/10);
        System.out.println(reverse(n));
    }
    public static int reverse(int x) {
        boolean f = false;
        if(x<0) f = true;
        int n = Math.abs(x);
        int rev = 0;
        while(n>0){
            int r = n %10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev*10 + r;
            n /= 10;
        }
        if(f){
            rev *= -1;
        }

        return rev;
    }
}
