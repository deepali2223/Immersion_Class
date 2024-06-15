package Assessment_1;

import java.util.Scanner;

public class InverseOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int len = (int)(Math.log10(n)+1);
        int i = 1;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev += i* Math.pow(10,rem-1);
            i++;
            n /= 10;
        }
        System.out.println(rev);
    }
}
