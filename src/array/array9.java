package array;

// Print odd elements first then even elements from array
public class array9 {
    public static void main(String[] args) {
        int[] marks={12,25,34,46,57};
        for (int i=0;i<marks.length;i++){
            if (marks[i]%2!=0) {
                System.out.println(marks[i]);
            }
        }
        for (int i=0;i<marks.length;i++){
            if (marks[i]%2==0) {
                System.out.println(marks[i]);
            }
        }
    }
}