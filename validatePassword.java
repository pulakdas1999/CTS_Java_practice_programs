package techstack;

import java.util.Scanner;

public class validatePassword {
    public static int validatePassword(String str){
        if(str.length()>=6 && str.length()<=20){
            if(str.contains("@") || str.contains("#") || str.contains("$")){
                if(str.matches(".*[0-9]{1,}.*")){
                    return 1;
                }else return -1;
            }else return -1;
        }else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(validatePassword(str));
    }
}
