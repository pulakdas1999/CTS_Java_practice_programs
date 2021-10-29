package techstack;

import java.util.*;
import java.text.*;

public class validateDate {
    public static int dateCheck(String date){
        if(date.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                Date date1 = sdf.parse(date);
                return 1;
            }catch (Exception e){
                return -1;
            }
        }else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        System.out.println(dateCheck(date));
    }
}
