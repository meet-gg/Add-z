package Stack;

import java.util.Arrays;
import java.util.Stack;
//next greater right side
public class monotonic_stack {
    public static void main(String[] args) {
        int[] mono={2,4,6,8,6,1,0};
        int[] ans=new int[mono.length];
        Stack<Integer> stack=new Stack<>();
        //chelle thi start thay kem ke chell mate right side ma greater no hoy aetle return -1
        //loop 0 thi start thay to                   LEFT SIDE GREATER MALE
        //loop 0 thi start thay ANE sign >= hoy to   LEFT SIDE SMALLER MALE
        //loop n-1 thi start thay ANE sign >= hoy to RIGHT SIDE SMALLER MALE

        for (int i=mono.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek()<=mono[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else {
                ans[i]=stack.peek();
            }
            stack.push(mono[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
