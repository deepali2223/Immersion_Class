package Assessment.Assessment_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DuplicateTreausreHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0 ;i<n;i++){
            a[i] = sc.nextInt();
        }
        findDupli(a,n);
    }
    public static void findDupli(int a[],int n){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            int in = Math.abs(a[i])-1;
            if(a[in]> 0){
                a[in] *= -1;
            }
            else if(a[in] <0){
                l.add(in+1);
            }
        }
        Collections.sort(l);
        for(int e: l){
            System.out.print(e+" ");
        }
    }
}
