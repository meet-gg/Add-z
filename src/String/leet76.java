package String;

public class leet76 {
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        for (int i=0;i<s.length();i++) {
            for (int j=i;j<s.length();j++) {
//                System.out.println(s.substring(i,j+1));
                if (s.substring(i, j+1).matches(t)){
                    System.out.println(s.substring(i,j+1));
                    return;
                }
            }
        }
    }
}
