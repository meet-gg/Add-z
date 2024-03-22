package String;

public class P11 {
    public static void main(String[] args) {
        String s = "me name is darshan ";
//        int count = 0;
        int[] ans=new int[128];
        for (int i = 0; i < s.length(); i++) {
                     ans[(int)s.charAt(i)]++;
            }
        for (int i=0;i< ans.length;i++){
            if(ans[i]>1){
                System.out.print((char)i);
            }
        }
        }
    }
