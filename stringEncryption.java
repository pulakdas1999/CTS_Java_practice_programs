package techstack;

import java.util.*;

public class stringEncryption {
    public static String stringEncryption(String str){
        Map<Character, Character> map = new HashMap();
        map.put('a', 'b');
        map.put('b', 'c');
        map.put('c', 'd');
        map.put('d', 'e');
        map.put('e', 'f');
        map.put('f', 'g');
        map.put('g', 'h');
        map.put('h', 'i');
        map.put('i', 'j');
        map.put('j', 'k');
        map.put('k', 'l');
        map.put('l', 'm');
        map.put('m', 'n');
        map.put('n', 'o');
        map.put('o', 'p');
        map.put('p', 'q');
        map.put('q', 'r');
        map.put('r', 's');
        map.put('s', 't');
        map.put('t', 'u');
        map.put('u', 'v');
        map.put('v', 'w');
        map.put('w', 'x');
        map.put('x', 'y');
        map.put('y', 'z');
        map.put('z', 'a');

        map.put('A', 'B');
        map.put('B', 'C');
        map.put('C', 'D');
        map.put('D', 'E');
        map.put('E', 'F');
        map.put('F', 'G');
        map.put('G', 'H');
        map.put('H', 'I');
        map.put('I', 'J');
        map.put('J', 'K');
        map.put('K', 'L');
        map.put('L', 'M');
        map.put('M', 'N');
        map.put('N', 'O');
        map.put('O', 'P');
        map.put('P', 'Q');
        map.put('Q', 'R');
        map.put('R', 'S');
        map.put('S', 'T');
        map.put('T', 'U');
        map.put('U', 'V');
        map.put('V', 'W');
        map.put('W', 'X');
        map.put('X', 'Y');
        map.put('Y', 'Z');
        map.put('Z', 'A');

        String new_str = "";
        for(int i=0; i<str.length(); i++){
            if(i%2==0){
                new_str += map.get(str.charAt(i));
            }else new_str += str.charAt(i);
        }
        return new_str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(stringEncryption(str));
    }
}
