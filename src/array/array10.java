package array;

// Find largest (maximum) element from array
public class array10 {
    public static void main(String[] args) {
        int[] marks={34,45,12,23,67};
        int larg=Integer.MIN_VALUE;
        for (int i=0;i<marks.length;i++){
            if (marks[i]>larg){
                larg=marks[i];
            }
        }
        System.out.println(larg);
    }
}