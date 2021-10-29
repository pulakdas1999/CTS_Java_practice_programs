package techstack;

import java.util.*;

public class removingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String string = sc.nextLine();
        String str = "";

        List<Character> my_list = new ArrayList<>();
        my_list.add('a');
        my_list.add('e');
        my_list.add('i');
        my_list.add('o');
        my_list.add('u');

        my_list.add('A');
        my_list.add('E');
        my_list.add('I');
        my_list.add('O');
        my_list.add('U');

        for (i=0;i<string.length();i++){
            if(!(i%2!=0 && my_list.contains(string.charAt(i)))){
                str += string.charAt(i);
            }
        }
        System.out.println(str);
    }
}
