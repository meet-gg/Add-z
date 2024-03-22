package array;

public class array4 {

    public static void main(String[] args) {
        int[] marks={1,2,3,4,5};
        int even=0,odd=0;
        for (int i=0;i<marks.length;i++){
            if (marks[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("even "+even);
        System.out.println("odd "+odd);
    }
}
