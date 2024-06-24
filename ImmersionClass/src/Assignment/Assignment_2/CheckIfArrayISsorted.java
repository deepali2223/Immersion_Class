package Assignment.Assignment_2;

import java.util.Scanner;

public class CheckIfArrayISsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(isSorted(a));
    }

    private static boolean isSorted(int[] a) {
    int c = 0;
    for(int i=0;i<a.length;i++){
        if(a[i]> a[(i+1)%a.length]){
            c++;
        }
    }
    return c<=1;
}
}
