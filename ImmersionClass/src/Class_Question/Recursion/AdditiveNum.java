//package Class_Question.Recursion;
//
//import java.util.ArrayList;
//
//public class AdditiveNum {
//    public static void main(String[] args) {
//        ArrayList<Integer> l = new ArrayList<>();
//        System.out.println(isAdditive("199100199",l));
//    }
//    public static boolean isAdditive(String num, ArrayList<Integer> l){
//        if(num.length() == 0){
//            return l.size()>=3?true:false;
//        }
//        for(int i=1;i<=num.length();i++){
//            String partition = num.substring(0,i);
//            String left  = num.substring(i);
//            if(isValid(l,partition)){
//                long cur = Long.parseLong(partition);
//                l.add(cur);
//                boolean res = isAdditive(left,l);
//                if(res){
//                    return true;
//                }
//                l.remove(l.size()-1);
//            }
//
//        }
//        return false;
//
//
//    }public static boolean isValid(ArrayList<Integer> l ,String ans){
//        if(l.size()<2){
//            return true;
//        }
//        long last = l.get(l.size()-1);
//        long secL = l.get(l.size()-2);
//        if(last+secL == Long.parseLong(ans)){
//            return true;
//        }
//        return false;
//    }
//    public static boolean isZero(String s){
//        if(s.length() == 1){
//            return true;
//        }
//        return s.charAt(0)==0?false:true;
//    }
//}
