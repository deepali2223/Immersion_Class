package Assessment.Marathon;

public class RevVowel {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char c[] = s.toCharArray();
        while(i<j){
            char c1 = c[i];
            char c2 = c[j];
            if(c1 == 'a'|| c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A'|| c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U'){
                if(c2== 'a'|| c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u' || c2 == 'A'|| c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U'){
                    char temp = c1;
                    c[i++] = c2;
                    c[j--] = temp;
                }
                else{
                    j--;
                }

            }
            else if(c2 == 'a'|| c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u' || c2 == 'A'|| c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U'){
                if(c1== 'a'|| c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A'|| c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U'){
                    char temp = c1;
                    c[i++] = c2;
                    c[j--] = temp;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
                j--;
            }

        }
        String ans = "";
        for(char ch : c){
            ans+= ch;
        }
        return ans;
    }
}
