package Class_Question.Recursion;

import java.util.Scanner;

public class PowerLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(powerLog(n,pow));
    }

    private static int powerLog(int n, int pow) {
        if(pow == 1){
            return n;
        }
        int x_n = powerLog(n,pow/2);
        int x_nby2 = x_n * x_n;
        if(pow % 2 != 0){
            return x_nby2*n;
        }
        return x_nby2;
    }
}
