package Class_Question;

import java.util.Scanner;

public class LexoGraphicalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<10;i++){
            print(i,n);
        }
    }

    private static void print(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        for(int j=0;j<10;j++){
            print(i*10+j,n);
        }
    }
}
