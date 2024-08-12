package Assessment.Marathon;

public class longpPressedName {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("a", "b"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int a = name.length();
        int b = typed.length();
        if (name.equals(typed)) {
            return true;
        }
        if(a > b){
            return false;
        }

        if(a == 1 && b == 1){
            return name.charAt (0) == typed.charAt(0);
        }
        int i = 0;
        int j = 0;
        while (i<a && j < b) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else return false;
        }
        if(j<b) {
            char c = name.charAt(a - 1);
            int in = a;
            int jn = b;
            while (in < jn) {
                if (typed.charAt(in++) != c) {
                    return false;
                }
            }
        }
        return true;
    }
}
