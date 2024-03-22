package array;

public class array28 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int sum=19;
        int left=0,right= num.length-1;
        while (left<right){
            if (num[left] + num[right] ==sum){
                System.out.println("present");
                return;
            }
            else if (num[left]+num[right]<sum){
               left++;
            }
            else {
                right--;
            }
        }
        System.out.println("not present");
    }
}
