package Extra_Question;

import java.util.Scanner;

public class Pascal_FindAtGivenR_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ans = 1;
        for(int i=0;i<c;i++){
            ans = (ans*(r-i))/(i+1);
        }
        System.out.println(ans);
    }
}
