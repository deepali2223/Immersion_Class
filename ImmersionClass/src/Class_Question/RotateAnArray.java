package Class_Question;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(a));
        rotateArray(a,k);
        System.out.println(Arrays.toString(a));
    }

    private static void rotateArray(int[] a, int k) {
        if(k > a.length){
            k %= a.length;
        }
        for(int i=0;i<k;i++){
            rotate(a);
        }
    }
    public static void rotate(int a[]){
        int first = a[a.length-1];
        for(int i = a.length-1;i>0;i--){
            a[i] = a[i-1];
        }
        a[0] = first;
    }
}
