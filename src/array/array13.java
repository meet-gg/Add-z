package array;

public class array13 {
    public static void main(String[] args) {
        int[] marks={1,2,3,4,5};
        int[] rev=new int[marks.length];
        for(int i=marks.length-1;i>=0;i--){
           rev[i]=marks[i];
           System.out.println(rev[i]);
        }
    }
}