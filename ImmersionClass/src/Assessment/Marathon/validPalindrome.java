package Assessment.Marathon;

public class validPalindrome {
    public static void main(String[] args) {
        System.out.println(isValid("A man, a plan, a canal: Panama"));
    }
    public static boolean isValid(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
