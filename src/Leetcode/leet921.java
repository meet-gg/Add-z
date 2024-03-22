package Leetcode;
import java.util.*;
public class leet921 {
    public static void main(String[] args) {
        String s="(((";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int diff=0;
        for (Character m : map.keySet()){
            diff=Math.abs(diff-map.get(m));
        }
        System.out.println(diff);
    }
}
