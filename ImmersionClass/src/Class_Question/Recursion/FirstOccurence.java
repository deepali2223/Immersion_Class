package Class_Question.Recursion;

import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findLast(new int[]{3,4,10,3,5,3},0,11));
    }

    private static int find(int[] a, int i, int tar) {
        if(i == a.length){
            return -1;
        }
        if(a[i] == tar){
            return i;
        }
        return find(a,i+1,tar);
    }
    private static int findLast(int[] a, int i, int tar) {
        if(i == a.length) {
            return -1;
        }
        int in = findLast(a,i+1,tar);
        if(in == -1){
            if(a[i] == tar){
                return i;
            }
        }
        else{
            return in;
        }
        return -1;
    }

}
