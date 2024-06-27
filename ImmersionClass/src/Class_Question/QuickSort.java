package Class_Question;

import java.util.Arrays;

public class QuickSort { // Avg - nlog n , Worst - n2 // space - 0(1)
    public static void main(String[] args) {
        int a[] ={5,8,6,4,3,2,1};
        quickSort(a,0,7);
        System.out.println(Arrays.toString(a));

    }
    public static void swap(int a[],int i,int pos){
        int temp = a[i];
        a[i] = a[pos];
        a[pos] = temp;
    }
    private static void quickSort(int a[],int s,int e){
        if(s>=0){
            return;
        }
        int index = rightPostition(a,s,e);
        quickSort(a,s,index-1);
        quickSort(a,index+1,e);
    }

    private static int rightPostition(int a[], int s, int e) {
        int pos =0 ;
        int tar = a[e];
        for(int i=s;i<e;i++){
            if(a[i]< tar){
                swap(a,i,pos);
                pos++;
            }
        }
        swap(a,a.length-1,pos);
        return pos;
    }
}
