package Extra_Question;

import java.util.Scanner;

public class SingleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findSingleNum( a,n));

    }

    private static int findSingleNum(int[] a, int n) {
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans ^ a[i];
        }
        return ans;
    }
}
