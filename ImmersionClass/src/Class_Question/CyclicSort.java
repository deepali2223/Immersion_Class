package Class_Question;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(a));
        cyclicSort(a,n);
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(a));
    }

    private static void cyclicSort(int[] a,int n) {
        int i =0;
        while(i<n){
            if(i == a[i]-1){
                i++;
            }
            else{
                swap(a,i,a[i]-1);
            }
        }
    }

    public static void swap(int a[],int i,int cIn){
        int temp = a[i];
        a[i] = a[cIn];
        a[cIn] = temp;
    }

    }
