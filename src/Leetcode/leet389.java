package Leetcode;

public class leet389 {
    public static void main(String[] args) {
        String s="aba";
//        String t="aa";
        String str = s + s;
        System.out.println(str);
        String str1 = str.substring(1, str.length() - 1);
        System.out.println(str1);
        System.out.println( str1.contains(s));
//        s.toCharArray();
//        t.toCharArray();
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i))
//        }
//        System.out.println(s.matches(s1));
//        s1.
//        System.out.println(s1.compareToIgnoreCase(s));
//        int sum=0,sum1=0;
//        int[] fre=new int[26];
//        for (int i=0;i<s.length();i++){
//            fre[s.charAt(i)-'a']++;
//        }
//
//        for (int i=0;i<t.length();i++){
//            fre[t.charAt(i)-'a']++;
//        }
//        for(int i=0;i<fre.length;i++){
//            if(fre[i]%2!=0){
//                System.out.println("false");
//                return;
//            }
//        }
//        System.out.println("true");
//        System.out.println(Arrays.toString(fre));
//        int sum=0,sum1=0;
//        for (int i=0;i<s.length();i++){
//            sum+=(int)s.charAt(i);
//        }
//
//        for (int i=0;i<s1.length();i++){
//            sum1+=(int)s1.charAt(i);
//        }
//        int re=sum1-sum;
//        System.out.println((char) re);
    }
}
