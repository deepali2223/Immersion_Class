package Assignment.Assignment_1;

import java.util.Scanner;

public class Palindrome_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        //converting to string
//        String temp = String.valueOf(num);
//        String rev = new StringBuilder(temp).reverse().toString();
//        return temp.equals(rev);

        //Without using string
        int rev = 0;
        int n = num;
        while(n>0){
            rev = rev*10 + (n%10);
            n /=10;
        }
        return rev == num;
    }
}
