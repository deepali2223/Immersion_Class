package Assessment.Assessment_2;

import java.util.Scanner;

public class LCM_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n / 2 + " " + n / 2);
            } else {
                int ans[] = new int[2];
                int min = Integer.MAX_VALUE;
                int pre = Integer.MAX_VALUE;
                for(int i = 1;i<=n/2;i++){
                    int sec = n-i;
                    int lcm = (sec*i)/gcd(i,sec);
                    pre = min;
                    min = Math.min(lcm,min);
                    if(min<pre){
                       ans[0] = i;
                       ans[1] = sec;
                    }
                }
                System.out.print(ans[0]+" ");
                System.out.print(ans[1]);
            }
            t--;
        }
    }
    private static int gcd(int num1,int num2){
                while(num1 > 0 && num2 >0){
                    if(num1>num2){
                        num1 %= num2;
                    }
                    else if (num2 > num1){
                        num2 %= num1;
                    }
                }
                return num1==0?num2:num1;
            }
        }
