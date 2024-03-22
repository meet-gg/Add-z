package String;

public class P13 {
    public static void main(String[] args) {
        String s1="acegikmo";
        String s2="bdfhjlnp";
        char[] ans=new char[s1.length()+s2.length()];
        int j=0;
        for(int i=0;i<s1.length();i++){
            ans[j]=s1.charAt(i);
            j++;
            ans[j]=s2.charAt(i);
            j++;
        }

        String an=new String(ans);
        System.out.println(an);
    }
}