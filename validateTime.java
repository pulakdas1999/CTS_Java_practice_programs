package techstack;

import java.util.*;
import java.text.*;

public class validateTime {
    public static int dateCheck(String date){
        StringTokenizer st = new StringTokenizer(date, ":");
        if(st.countTokens()==3){
            SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss a");
            sdf.setLenient(false);
            try {
                Date date1 = sdf.parse(date);
                return 1;
            }catch (Exception e){
                return -1;
            }
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
            sdf.setLenient(false);
            try {
                Date date1 = sdf.parse(date);
                return 1;
            }catch (Exception e){
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        System.out.println(dateCheck(date));
    }
}
