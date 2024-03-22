package String;

public class P10_2 {
    public static void main(String[] args) {
        String s="madam racecar nana";
        int left=0,right=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                if (ispalindome(s, left, right - 1) == false) {
                    System.out.println("not palindrome");
                    return;
                }
                left = right + 1;
            }
            right++;
        }
            if (ispalindome(s,left,right-1)==false){
                System.out.println("not palindrome");
                return;
            }
        System.out.println("palindrome");
    }

    public static boolean ispalindome(String s,int left,int right) {
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
