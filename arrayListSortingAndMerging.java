package techstack;

import java.util.*;

public class arrayListSortingAndMerging {
    public static void callMe(List<Integer> my_list){
        List<Integer> new_list = new ArrayList<>();
        Collections.sort(my_list);
        new_list.add(my_list.get(2));
        new_list.add(my_list.get(6));
        new_list.add(my_list.get(8));
        for (int i:
             new_list) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> my_list_1 = new ArrayList<>();
        List<Integer> my_list_2 = new ArrayList<>();
        List<Integer> my_list_3 = new ArrayList<>();
        for(int i = 0; i<5; i++){
            my_list_1.add(sc.nextInt());
        }
        for(int i = 0; i<5; i++){
            my_list_2.add(sc.nextInt());
        }
        my_list_1.addAll(my_list_2);
        callMe(my_list_1);
    }
}
