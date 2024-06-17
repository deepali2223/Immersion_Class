package Class_Question;

import java.util.Scanner;

public class Longest_NonRepeatingSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int st=0;
        int end = 0;
        int maxSize =0;
        int freq[] = new int[256];
        while(end<s.length()){
            int i = s.charAt(end);
            freq[i]++;
            while(freq[i]>1){
                int r = s.charAt(st);
                freq[r]--;
                st++;
            }
            int curSize = end - st +1;
            maxSize = Math.max(maxSize,curSize);
        }
        return maxSize;
    }
}
