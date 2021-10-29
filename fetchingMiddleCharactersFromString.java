package techstack;

import java.util.Scanner;

public class fetchingMiddleCharactersFromString {
    public static String fetch(String a){
        String str = "";
        if(a.length()%2==0) {
            str += a.charAt((a.length() / 2) - 1);
            str += a.charAt(a.length() / 2);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(fetch(str));
    }
}
