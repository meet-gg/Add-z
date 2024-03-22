package String;

public class P9 {
    public static void main(String[] args) {
        String s="my name is urvish";
        s=s.toLowerCase();
        char[] c=s.toCharArray();
        int count=0;
        for (int i=0;i<c.length;i++){
            if (c[i]=='a' || c[i]=='e'|| c[i]=='i' || c[i]=='o'||c[i]=='u'){
                count++;
            }
        }
        int k=0;
        char[] c1=new char[c.length-count];
        for (int i=0;i<s.length();i++){
            if (c[i]!='a' && c[i]!='e'&& c[i]!='i' && c[i]!='o'&&c[i]!='u') {
                c1[k] = s.charAt(i);
                k++;
            }
        }
        s=new String(c1);
        System.out.println(s);
    }
}
