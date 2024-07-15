package Class_Question.Recursion;

import java.util.Scanner;

public class DisplayArrayInRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(new int[]{1,2,3,4,5},0);
    }

    private static void print(int[] ints, int i) {
        if(i == ints.length){
            return;
        }
        print(ints,i+1);
        System.out.println(ints[i]);
    }
}
