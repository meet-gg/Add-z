package String;

import java.util.Arrays;

public class prog {
    public static void main(String[] args) {
       String[] strs = {"zyx","wvu","tsr"};
        int count=0;
        String[] ans=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String st=new String(c);
            ans[i]=st;
        }
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals(ans[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
