package HashMapSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class most_frequent_ele {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,2,2,4,4,4,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr){
            if (!map.containsKey(i)){
                map.put(i,1);
            }
            else {
                map.put(i,map.get(i)+1);
//                System.out.println( map.put(i,map.get(i)+1));
            }
        }
        int val= (Collections.max(map.values()));
        for (Map.Entry<Integer,Integer> me : map.entrySet()){
            if (me.getValue()==val) {
                System.out.println(me.getKey() + "-" + me.getValue());
            }
        }
    }
}
