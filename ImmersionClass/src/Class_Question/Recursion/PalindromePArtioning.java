package Class_Question.Recursion;

public class PalindromePArtioning {
    public static void main(String[] args) {
        partion("aab","");
    }
    public static void partion(String s,String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 1;i<=s.length();i++){
            String small = s.substring(0,i);
            String left = s.substring(i);
            if(isPalindromme(small)){
                partion(left,ans+small+" ");
            }
        }
    }
    public static boolean isPalindromme(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
