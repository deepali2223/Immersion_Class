package Class_Question;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findCount(num));
    }

    private static int findCount(int num) {
        int c = 0;
        int n = num;
        while(n>0){
            int rem = n%10;
            if(num % rem == 0 && rem != 0){
                c++;
            }
            n = n/10;
        }
        return c;
    }
}
