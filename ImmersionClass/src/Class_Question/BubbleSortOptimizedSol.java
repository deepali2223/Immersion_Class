package Class_Question;

public class BubbleSortOptimizedSol {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){
                continue;
            }
            else{
                swapEle(a,i,i+1);
            }
        }
    }

    private static void swapEle(int a[],int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }
}
