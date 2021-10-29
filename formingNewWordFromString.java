package techstack;

import java.util.Scanner;

public class formingNewWordFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(str.substring(0, n)+str.substring(str.length()-n, str.length()));
    }
}
