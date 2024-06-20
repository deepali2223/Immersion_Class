package Extra_Question;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isContainsPermu(s1,s2));
    }

    private static boolean isContainsPermu(String s1, String s2) {
        int freq1 [] = new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        char c[] = s2.toCharArray();
        int m = s1.length();
        int n = s2.length();
        int curF[] = new int[26];
        for(int i=0;i<m;i++){
            curF[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,curF)){
            return true;
        }
        for(int i = m;i<n;i++){
            curF[s2.charAt(i-m)-'a']--;
            curF[s2.charAt(i)-'a']++;
            if(Arrays.equals(curF,freq1)){
                return true;
            }
        }
       return false;
    }

}
