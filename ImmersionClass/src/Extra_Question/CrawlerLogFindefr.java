package Extra_Question;

import java.util.Scanner;
import java.util.Stack;

public class CrawlerLogFindefr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(minOperations(new String[]{"./","../","./"}));
    }
    public static int minOperations(String[] logs) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(!s.isEmpty() && logs[i].equals("../") ){
                s.pop();
            }
            else if(!logs[i].equals("./")){
                s.push(1);
            }
        }
        return s.size();
    }
}
