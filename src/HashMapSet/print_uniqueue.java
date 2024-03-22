package HashMapSet;

import java.util.HashSet;

public class print_uniqueue {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,6,4,2,5,8,9,3,1,7};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> Dset=new HashSet<>();
//        System.out.println(set.add(2));
        for (int i: arr){
            if(set.add(i)){
                Dset.add(i);
            }
            else {
                Dset.remove(i);
            }
        }
        System.out.println(Dset);
    }
}
