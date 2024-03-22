package HashMapSet;

import java.util.HashMap;
import java.util.Map;

public class count_frequency {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,2,2,4,4,4,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr){
            if (!map.containsKey(i)){
                    map.put(i,1);
            }
            else {
                map.put(i,map.get(i)+1);
            }
//            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry me : map.entrySet()){
            System.out.println(me.getKey()+"-"+me.getValue());
        }
    }
}
