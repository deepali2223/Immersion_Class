package Assessment.Marathon;

import java.util.Stack;

public class backspace {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }
    public static boolean backspaceCompare(String s, String t) {
        String a = delete(s);
        System.out.println(a);
        String b = delete(t);
        System.out.println(b);
        return a.equals(b);

    }
    public static String delete(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!stk.isEmpty() && c == '#'){
                stk.pop();
            }
            else
            stk.push(c);
        }
        String ans = "";
        while(!stk.isEmpty()){
            ans += stk.pop();
        }
        return new StringBuilder(ans).reverse().toString();
    }
}
