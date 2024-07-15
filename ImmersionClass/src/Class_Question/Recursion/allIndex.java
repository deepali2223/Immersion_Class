package Class_Question.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class allIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(findAllIndex(new int[]{2,3,6,9,8,3,2,3,6,4},3,0,0)));
    }

    private static int[] findAllIndex(int[] a,int tar,int i,int fsf) {
        if(i == a.length){
            return new int[fsf];
        }
        if(a[i] == tar){
           int ans[] = findAllIndex(a,tar,i+1,fsf+1);
           ans[fsf] = i;
           return ans;
        }
        else{
            int ans[] = findAllIndex(a,tar,i+1,fsf);
            return ans;
        }

    }

}
