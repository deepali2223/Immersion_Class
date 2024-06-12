package Class_Question;

import java.util.Scanner;

public class CountNoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int noOfDigit = (int)(Math.log10(num)+1);
        System.out.println("No of digit ="+ noOfDigit);
        //brute force
        int ans = findLen(num);
        System.out.println(ans);
    }

    private static int findLen(int num) {
        int c = 0;
        while(num >0){
            int rem = num%10;
            c++;
            num /=10;
        }
        return c;
    }
}
