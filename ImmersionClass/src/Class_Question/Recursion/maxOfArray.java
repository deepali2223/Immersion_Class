package Class_Question.Recursion;

import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findMax(new int[]{614,7,4,3,45,78},0));
    }

    private static int findMax(int[] a,int i) {
        if(i== a.length){
            return 0;
        }
        int ele = findMax(a,i+1);
        return a[i]> ele? a[i]:ele;
    }
}
