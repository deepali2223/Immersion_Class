package Assignment.Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        rotateArr(a,d,n);
        System.out.println(Arrays.toString(a));
    }

     static void rotateArr(int[] a, int d, int n) {
        d %= n;
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
    }
    //givees TLE
//    static void rotateArr(int arr[], int d, int n) {
//        d %= n;
//        for(int i=0;i<d;i++){
//            rotate(arr);
//        }
//
//    }
//
//    private static void rotate(int[] arr) {
//        int temp = arr[0];
//        for(int i=0;i<arr.length-1;i++){
//            arr[i] = arr[i+1];
//        }
//        arr[arr.length-1] = temp;
//    }

    static void reverse(int arr[],int i,int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}
