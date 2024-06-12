package Class_Question;

import java.util.Scanner;

public class Pascal_Tri_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=0;i<row;i++){
            int data = 1;
            //spaces
            for(int space = row-i;space >=2;space--) {
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print(data+" ");
                data = ((i-j)*data)/(j+1);
            }
            System.out.println();
        }
    }
}
