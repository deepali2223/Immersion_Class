package Assignment.Assignment_1;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            if(n<7 || n ==9){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                if(n%3==0){
                    System.out.println(1+" "+4+" "+(n-5));
                }
                else{
                    System.out.println(1+" "+2+" "+(n-3));
                }
            }
            t--;
        }
    }
}
