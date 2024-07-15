package Assignment.Assignment_3;

import java.util.Scanner;

public class Power_Of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPower(n));
    }

    private static boolean isPower(int n) {
       if(n == 1){
           return true;
       }
       if(n% 2!= 0 || n == 0){
           return false;
       }
       return isPower(n/2);
    }
}
