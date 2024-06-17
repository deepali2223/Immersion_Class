package Extra_Question;

import java.util.Scanner;

public class SumOfSquareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(judgeSquareSum(n));
    }
    public static boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int)(Math.sqrt(c));
        while(i<= j){
            long res = (long) (Math.pow(i,2)+Math.pow(j,2));
            if( res == c){
                return true;
            }
            else if(res > c){
                j--;
            }
            else i++;
        }
        return false;
    }
}
