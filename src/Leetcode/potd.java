package Leetcode;
import java.util.*;

//Input: s = "lee(t(c)o)de)"
//Output: "lee(t(c)o)de"
public class potd {
    public static void main(String[] args) {
        String  s = "lee(t(c)o)de)";
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                s1.push(i);
            }
            else if (ch==')' && !s1.isEmpty() && s1.peek()=='('){
                s1.pop();
            }
            else {
                s1.push(i);
            }
        }
        StringBuilder sb=new StringBuilder();
        HashSet<Integer> set=new HashSet<>(s1);
        for (int i=0;i<s.length();i++){
            if (!set.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
