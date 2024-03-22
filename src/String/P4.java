package String;

public class P4 {
    public static void main(String[] args) {
        String str="   my name is a urvishhhhh ";
        int count=1;
        str=str.trim();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
