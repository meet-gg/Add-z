package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode48 {
    public static void main(String[] args) {
      String[]  strs = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<ArrayList<String>> mainlist=new ArrayList<>();
      int[] ans=new int[strs.length];
        System.out.println(Arrays.toString(strs));
        for(int i=0;i<strs.length;i++){
            int sum=0;
            for(int j=0;j<strs[i].length();j++){
                sum+=(int)strs[i].charAt(j);
            }
            ans[i]=sum;
        }
        for (int i=0;i<ans.length;i++){
            ArrayList<String> list=new ArrayList<>();
            for (int j=i+1;j<ans.length;j++){
//                if(i==j){
//                    continue;
//                }
                if(ans[i]==ans[j]){
                    list.add(strs[i]);
                    list.add(strs[j]);
                    int k=0;

                    ans[j]=k;
                    k++;

                }
            }
            mainlist.add(list);
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(mainlist);
    }
}
