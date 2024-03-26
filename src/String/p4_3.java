package String;

public class p4_3 {
    public static void main(String[] args) {
        String s=" my name is a meet we aareee    the ";
        int word=0;
        boolean flag=false;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                if (!flag){
                    word++;
                    flag=true;
                }
            }
            else {
                flag=false;
            }
        }
        System.out.println(word);
    }
}
