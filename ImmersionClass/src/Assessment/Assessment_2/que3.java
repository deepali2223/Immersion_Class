package Assessment.Assessment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class que3 {
    public static void main(String[] args) {
//        System.out.println(passwordCracker(new ArrayList<>(){because can do must we what
//        }));
        String s = "deepali";
        char[] c = s.toCharArray();
        Arrays.fill(c, 0, 1, '$');
        System.out.println(Arrays.toString(c));


    }

    public static String passwordCracker(List<String> passwords, String loginAttempt) {
        ArrayList<Integer> in = new ArrayList<>();
        String curStr = "";
        char c[] = loginAttempt.toCharArray();
        int st = 0;
        for (int i = 0; i < c.length; i++) {
            curStr += c[i];
            if (isPresent(curStr, passwords, in)) {
                curStr = "";
                Arrays.fill(c, st, i, '#');
                st = i + 1;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '#') {
                return "WRONG PASSWORD";
            }
        }
        String ans = "";
        for (int i = 0; i < in.size(); i++) {
            ans += passwords.get(in.get(i)) + " ";
        }
        return ans;

    }

    private static boolean isPresent(String s, List<String> passwords, ArrayList<Integer> index) {
        if (!passwords.contains(s)) {
            return false;
        } else {
            index.add(passwords.indexOf(s));
        }
        return true;
    }
}
