package techstack;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int new_num=0;
        while (n!=0){
            new_num = new_num*10 + (n%10);
            n /= 10;
        }
        System.out.println(new_num);
    }
}
