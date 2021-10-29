package techstack;

import java.util.Scanner;

public class checkCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println("Valid");
        }else System.out.println("Invalid");
    }
}
