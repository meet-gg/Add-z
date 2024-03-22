package Stack;

public class check_st_palind {
    public static void main(String[] args) {
        String s="naman";
        int top=-1;
        char[] c=new char[s.length()];
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' '){
                top=pust(c,top,s.charAt(i));
            }
        }
        if (print(c,top,s)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
    private static int pust(char[] c,int top,char value){
        if(top==c.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        c[top]=value;
        return top;
    }
    private static boolean print(char[] c,int top,String s){
        int index=0;
        while (top>=0){
            if (c[top]!=s.charAt(index)){
                return false;
            }
            top--;
            index++;
        }
        return true;
    }
}
