package Assignment.Assignment_2;

import java.util.Scanner;

public class ThirdMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(Integer.MIN_VALUE);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findThirdMAx(a));
    }

    private static int findThirdMAx(int[] a) {
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i= 0 ;i< a.length;i++){
            if(a[i] > first){
                third = sec;
                sec = first;
                first = a[i];
            }
            else if(a[i] < first && a[i] > sec){
                third = sec;
                sec = a[i];
            }
            else if(a[i] < first && a[i] < sec && a[i] > third){
                third = a[i];
            }
        }
        return third == Long.MIN_VALUE ? (int)first:(int)third;
    }
}
