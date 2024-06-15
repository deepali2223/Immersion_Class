package Extra_Question;

import java.util.Scanner;

public class OutputQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(7%0);
        //System.out.println(max(513,2));
    }

    private static int max(int i, int a) {
        if(i>0){
            return i % max(i/a,a);
        }
        return 0;
    }
}
