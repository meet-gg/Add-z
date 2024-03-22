package array;

public class array1 {
    public static void main(String[] args) {
        int[] marks={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println(sum);
    }
}
