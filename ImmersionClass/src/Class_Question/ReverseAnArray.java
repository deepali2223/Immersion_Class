package Class_Question;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for(int i=0;i<n;i++){
//            a[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(a));
//        reverseArray(a);
//        System.out.println(Arrays.toString(a));
//
//    }
//
//    private static void reverseArray(int[] a) {
//        int i = 0;
//        int j = a.length-1;
//        while(i<j){
//            int temp = a[i];
//            a[i++] = a[j];
//            a[j--] = temp;
//        }
        int [] arr = {1 , 2 , 3 , 4 , 5};

        // c type array
        int brr[] = {10 , 20 , 30 , 40 , 50};

        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(brr));
        swap2(arr);
        System.out.println(Arrays.toString(arr));
        swap2(arr);
        System.out.println(Arrays.toString(arr));
        swap3(arr[0] , arr[1]);
        System.out.println(Arrays.toString(arr));

    }
    static void swap2(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    static void swap3(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
