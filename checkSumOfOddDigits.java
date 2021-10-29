package techstack;

import java.util.Scanner;

public class checkSumOfOddDigits {
    public static int checkSum(int n){
        int s = 1;
        int sum = 0;
        int temp;
        while(n!=0){
            temp = n%10;
            if (temp%2!=0){
                sum+=temp;
            }
            n = n/10;
        }
        if (sum%2==0){
            s = -1;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkSum(n));
    }
}
