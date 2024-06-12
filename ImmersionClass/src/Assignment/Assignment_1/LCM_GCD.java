package Assignment.Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class LCM_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = Long.valueOf(354293);
        Long B = Long.valueOf(125208);
        System.out.println(Arrays.toString(lcmAndGcd(A,B)));
    }
     static Long[] lcmAndGcd(Long A , Long B) {
        // Giving TLE
//        long G = 0;
//        long L = 0;
//        for(long i= Math.min(A,B);i>=1;i--){
//            if(A%i == 0 && B %i == 0){
//                G = i;
//                break;
//            }
//        }
//        L = (A*B)/G;
//        Long[] a = {L,G};
//        return a;
         long a = A;
         long b = B;
         while(A>0 && B>0){
             if(A> B){
                 A %= B;
             }
             else if(B>A) {
                 B %= A;
             }
         }
         long GCD = A==0?B:A;
         long LCM = a*b/GCD;
         Long [] ans = {LCM,GCD};
         return ans;
    }
}
