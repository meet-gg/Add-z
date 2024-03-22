package HashMapSet;
import java.util.HashSet;

public class pair_with_given_sum {
    public static void main(String[] args) {
        int sum=18;
        int[] arr={2,5,3,6,7,2,9,18,10};
        HashSet<Integer> set=new HashSet<>();
        for (int i:arr){
            int ans=sum-i;
            if (set.contains(ans)){
                System.out.println(true);
//                System.out.println(ans);
//                System.out.println(i);
                return;
            }
            else {
                set.add(i);
            }
        }
        System.out.println(false);
    }
}
