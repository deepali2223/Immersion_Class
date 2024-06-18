package Class_Question.Recursion;

import java.util.Scanner;

public class PowerFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        //System.out.println(power(x,n));
        System.out.print(BinaryPower(x,n));
    }
    //O(n)
//    public static int power(int x,int n){
//        if(n == 1){
//            return x;
//        }
//        return x*power(x,n-1);
//    }
    //O(log n)
    public static int BinaryPower(int x,int n){
       if(n == 0){
           return 1;
       }
       int half = BinaryPower(x,n/2);
       int full = half * half;
       if(n % 2 == 0){
           return full;
       }
       return x* full;
    }
}
