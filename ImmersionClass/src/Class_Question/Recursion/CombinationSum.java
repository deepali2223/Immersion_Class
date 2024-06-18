package Class_Question.Recursion;

import java.util.Scanner;

public class CombinationSum {
    static int tar;
    static int a[];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        tar = sc.nextInt();
        //combinationSum(a,n,tar,0,0,"");
    }

    private static void combinationSum(int[] a, int n, int tar,int i,int sum,String ans) {
        if(i == n){
            if(sum == tar){
                System.out.println(ans);
            }
            return;
        }
        combinationSum(a,n,tar,i+1,sum,ans);
        combinationSum(a,n,tar,i+1,sum+a[i],ans+a[i]+" ");
    }
}
