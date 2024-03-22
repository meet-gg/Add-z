package HashMapSet;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,1,4,2,2,3,3,4,4,5};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> Dset=new HashSet<>();
//        System.out.println(set.add(2));
//        System.out.println(set.add(2));
        for (int i: arr){
            if(set.add(i)){
                Dset.remove(i);
            }
            else {
                Dset.add(i);
            }
        }
        System.out.println(Dset);
    }
}
