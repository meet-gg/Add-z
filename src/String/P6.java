package String;

public class P6 {
    public static void main(String[] args) {
        String str="memht";
        char sp='g';
        char ba='m';
        char[] c=str.toCharArray();
        for (int i=0;i<c.length;i++){
            if (c[i]==ba){
               c[i]=sp;
            }
        }
        str=new String(c);
        System.out.println(str);
    }
}
