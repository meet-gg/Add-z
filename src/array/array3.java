package array;

public class array3 {
    public static void main(String[] args) {
        int[] marks={1,2,3,4,5};
        int key=5;
        for (int i=0;i<marks.length;i++){
            if (marks[i]==key) {
                System.out.println("present");
                return;
            }
        }
        System.out.println("not present");
    }
}
