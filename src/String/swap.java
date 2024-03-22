package String;

public class swap {
    public static void main(String[] args) {
        String s1="my name is meet";
        String s2="my name is urvish";
        s1=s1+s2;
        for(int i=s2.length()-1;i<s1.length();i++){
            s1+=s1.charAt(i);
        }
        System.out.println(s1);
    }
}
