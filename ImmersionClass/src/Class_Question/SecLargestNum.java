package Class_Question;

import java.util.Scanner;

public class SecLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findSecLArgest(a));
    }

    private static int findSecLArgest(int[] a) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                sec = max;
                max = a[i];
            } else if (a[i]<max && a[i]>sec)  {
                sec = a[i];
            }
        }
        return sec;
    }
}
