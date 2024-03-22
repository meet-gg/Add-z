package array;

import java.util.ArrayList;

public class arraylist2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);
        mainlist.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(14);
        list2.add(15);
        list2.add(16);
        list2.add(17);
        mainlist.add(list2);
        System.out.println(mainlist);

    }
}
