package HashMapSet;

import java.util.HashSet;

public class print_distinct_element {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,5,6,7};
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
