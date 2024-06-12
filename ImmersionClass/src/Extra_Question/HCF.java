package Extra_Question;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(findHCF(num1,num2));

    }

    private static int findHCF(int num1, int num2) {
        for(int i = Math.min(num1,num2);i>1;i--){
            if(num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }
        return 1;
    }
}
