package HashMapSet;

import java.util.HashMap;

public class check_two_array_equal {
    public static void main(String[] args) {
        int[] a={2,5,2,2,6};
        int[] b={2,5,2,6,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i: a){
            if (!map.containsKey(i)){
                map.put(i,1);
            }
            else {
                map.put(i,map.get(i)+1);
            }
        }
        for (int i : b){
            if (map.containsKey(i)){
                if (map.get(i)==1){
                    map.remove(i);
                }
                else if (map.get(i)>1){
                    map.put(i,map.get(i)-1);
                }
            }
            else {
                System.out.println("not same");
                return;
            }
        }
        if (!map.isEmpty()){
            System.out.println("not same");
            return;
        }
        System.out.println("same");

    }
}
