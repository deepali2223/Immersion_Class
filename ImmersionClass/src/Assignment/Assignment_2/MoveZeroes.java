package Assignment.Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        moveZero(a,n);
        System.out.println(Arrays.toString(a));
    }

    private static void moveZero(int[] nums, int n) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
                if(nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = 0;
                    nums[i++] = temp;
                }
                j++;
            }
        }
    }
