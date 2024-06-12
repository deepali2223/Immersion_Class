package Extra_Question;

import java.util.Scanner;

public class Pascal_PrintGIvenRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int data = 1;
        for(int i=0;i<=row;i++){
            System.out.print(data+" ");
            data = data*(row-i)/(i+1);
        }
    }
}
