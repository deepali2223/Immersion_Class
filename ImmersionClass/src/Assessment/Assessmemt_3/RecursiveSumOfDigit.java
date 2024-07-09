package Assessment.Assessmemt_3;

public class RecursiveSumOfDigit {
    public static void main(String[] args) {
      System.out.println(superDigit("148148148",300));
    }
    public static int superDigit(String n, int k) {
       n = String.valueOf(helper(n)*k);
       return helper(n);
    }
    public static int helper(String s){
        if(s.length() == 1){
            return Integer.parseInt(s);
        }
        long sum = sumOfEachDigit(s);
        return helper(String.valueOf(sum));
    }
    public static long sumOfEachDigit(String num){
     long s = 0;
     int i = 0;
     while(i<num.length()){
         s += num.charAt(i++)-'0';
     }
     return s ;
    }
}
