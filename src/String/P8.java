package String;

public class P8 {
    public static void main(String[] args) {
        String s="my name is meet";
        int[] ascii=new int[128];
        for (int i=0;i<s.length();i++){
                ascii[(int)s.charAt(i)]++;
        }
       for (int i=0;i<ascii.length;i++){
        if (ascii[i]>0){
            System.out.println((char)i+ ":" +ascii[i]);
        }
       }
    }
}
