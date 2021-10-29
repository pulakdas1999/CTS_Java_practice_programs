package techstack;

import java.util.Scanner;

public class numberValidation {
    public static int numberValidation(String n){
        int s=-1;
        if(n.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")){
            s=1;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(numberValidation(n));
    }
}
