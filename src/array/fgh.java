package array;

public class fgh {
    public static void main(String[] args) {
        int[] marks={1,1,2};
        for (int i=0;i<marks.length;i++){
            for (int j=i+1;j<marks.length;j++){
                if (marks[i]==marks[j]){
                   continue;
                }
            }
            System.out.println(marks[i]);
            break;
        }
    }
}
