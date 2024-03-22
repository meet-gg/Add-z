package array;

public class binase {
    public static void main(String[] args) {
        int[] arr={12,52,63,54,85,96,87,54};
        int start=0;
        int end=arr.length-1;
        int key=54;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (key==arr[mid]){
                System.out.println("present");

            }
            else if (arr[mid]<key){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        System.out.println("npt present");
    }
}
