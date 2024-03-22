package array;

public class array2 {
    public static void main(String[] args) {
        int[] marks={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        int avg =sum/marks.length;
        System.out.println(avg);
    }
}
