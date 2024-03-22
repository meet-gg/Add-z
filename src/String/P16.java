package String;

public class P16 {
    public static void main(String[] args) {
        String s="meet goyani  meet";
        int[] ans=new int[128];
        for (int i = 0; i < s.length(); i++) {
            ans[(int)s.charAt(i)]++;
        }
        for (int i=0;i< ans.length;i++){
            if(ans[i]==1){
                System.out.print((char)i);
//                s.replace(s.charAt(i),(char)i);
            }
        }
        System.out.println();
        System.out.println(s);
    }
}
