package techstack;

import java.util.*;

public class removeAlphabetsFromString {
    public static String getSpecialChar(String s)
    {
        int i;
        String newStr="";
        for (i=0; i<s.length(); i++){
            if(!((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 && s.charAt(i)<=122))){
                newStr = newStr + s.charAt(i);
            }
        }
        return newStr;
    }

    public static int validateColorCode(String s1)
    {
        List<Character> my_list = new ArrayList<>();
        my_list.add('0');
        my_list.add('1');
        my_list.add('2');
        my_list.add('3');
        my_list.add('4');
        my_list.add('5');
        my_list.add('6');
        my_list.add('7');
        my_list.add('8');
        my_list.add('9');
        if(s1.charAt(0)=='#' && s1.length()==7){
            for(int i=1;i<s1.length();i++){
                if((s1.charAt(i)>=65 && s1.charAt(i)<=90)||(s1.charAt(i)>=97 && s1.charAt(i)<=122)||
                        (my_list.contains(s1.charAt(i)))){
                    continue;
                }else{
                    return -1;
                }
            }
        }else{
            return -1;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getSpecialChar(str));
        System.out.println(validateColorCode(str));
    }
}
