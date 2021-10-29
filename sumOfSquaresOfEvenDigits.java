package techstack;

import java.util.Scanner;

public class sumOfSquaresOfEvenDigits {
    public static int checkSum(int n){
        int sum = 0;
        int temp;
        while(n!=0){
            temp = n%10;
            if (temp%2==0){
                sum+=(temp*temp);
            }
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkSum(n));
    }
}
