package String;
import java.util.ArrayList;
public class P16_2 {
    public static void main(String[] args) {
        String s="dhruvin dhameliya";
        int[] ans=new int[128];
        for (int i = 0; i < s.length(); i++) {
            ans[(int)s.charAt(i)]++;
        }
        int count=0;
        int[] ans2=new int[128];
        for (int i=0;i< ans2.length;i++){
            ans2[i]=ans[i];
        }
        for (int i=0;i< ans.length;i++){
            while (ans2[i]>=1){
                count++;
                ans2[i]--;
            }
        }
        ArrayList<Character> list=new ArrayList<>();
        int j=0;
        for (int i=0;i<ans.length;i++){
            if(ans[i]==1){
                list.add(j,(char)i);
                j++;
            }
        }
        System.out.println(list.toString());
    }
}