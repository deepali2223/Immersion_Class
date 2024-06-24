package Class_Question;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        reverseArray(a);
        System.out.println(Arrays.toString(a));

    }

    private static void reverseArray(int[] a) {
        int i = 0;
        int j = a.length-1;
        while(i<j){
            int temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
    }

}
