package array;

import java.util.Arrays;
        public class array29 {
            public static void main(String[] args) {
                int[] num={0,1,0,0,1,0,1,1,0,0,1};
                int left=0,right= num.length-1;
                while (left<right){
                    if (num[left]==0){
                        left++;
                    }
                    else if (num[right]==1){
                        right--;
                    }
                    else{
                        int temp=num[left];
                        num[left]=num[right];
                        num[right]=temp;
                    }
                }
                System.out.println(Arrays.toString(num));
            }
        }