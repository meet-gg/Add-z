package Leetcode;
import java.util.*;
public class leetcode2744 {
    public static void main(String[] args) {
        String[] words={"ab","ba","cc"};
                int count=0;
                ArrayList<String> list=new ArrayList<>();
                for(int i=0;i<words.length;i++){
                    list.add(words[i]);
                }
                System.out.println(list);
                for(int i=0;i<list.size();i++){
                    StringBuilder sb=new StringBuilder(list.get(i)).reverse();
                    System.out.println(sb);
                    int a=list.indexOf(sb.toString());
                    System.out.println(a);
                    if(list.contains(sb.toString())){
//                        count++;
                        list.remove(sb.toString());
                    }
                }
                System.out.println(list);
            System.out.println(list.size());
            }
        }
