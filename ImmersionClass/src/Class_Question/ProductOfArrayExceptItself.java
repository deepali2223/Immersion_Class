package Class_Question;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        product(new int[]{1,2,3,4});
    }
    private static void product(int a[]){
        int n = a.length;
        int cur = 1;
        int ans[] = new int[n];
        Arrays.fill(ans,1);
        for(int i=0;i<n;i++){
            ans[i] *= cur;
            cur *= a[i];
        }
        cur = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] *= cur;
            cur *= a[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
