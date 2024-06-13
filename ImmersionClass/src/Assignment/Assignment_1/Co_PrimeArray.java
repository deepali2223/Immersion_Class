package Assignment.Assignment_1;

import java.util.Scanner;

public class Co_PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(countCoPrime(a,n));
    }
    static int countCoPrime(int a[], int n)
    {
        int c = 0;
        for(int i =0;i<n-1;i++){
            if(findGCD(a[i],a[i+1])!= 1){
                c++;
            }
        }
        return c;
    }
    public static int findGCD(int a,int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else if (a < b) {
                b %= a;
            }
        }
        return a == 0 ? b : a;

    }
}
