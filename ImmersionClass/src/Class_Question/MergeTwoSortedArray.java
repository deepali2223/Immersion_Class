package Class_Question;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        MegreArray(new int[]{1,5,8},new int[]{2,3,4,6,7});
    }

    public static void MegreArray(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
    int ans [] = new int[n+m];
     int i = 0;
     int j = 0;
     int c = 0;
     while(i <n && j<m){
         if(a[i] < b[j]){
             ans[c++] = a[i++];
         }
         else{
             ans[c++] = b[j++];
         }
     }
     if(i != n){
         for(int in = i;in<n;in++){
             ans[c++] = a[in];
         }
     }
     else if(j != m){
            for(int in = j;in<m;in++){
                ans[c++] = a[in];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
