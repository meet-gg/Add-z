package HashMapSet;

import java.util.Arrays;
import java.util.HashSet;

public class pair_diff {
    public static void main(String[] args) {
        int sum=2;
        int[] arr={0,1,2};
        Arrays.sort(arr);
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i=arr.length-1;i>=0;i--){
            int ans=sum+arr[i];
            if (set.contains(ans)){
                count++;
//                System.out.println(true);
//                System.out.println(ans);
//                System.out.println(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
//        System.out.println(false);
        System.out.println(count);
    }
}
