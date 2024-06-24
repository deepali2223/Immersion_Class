package Class_Question;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findLArgest(a));
    }

    private static int findLArgest(int[] a) {
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
