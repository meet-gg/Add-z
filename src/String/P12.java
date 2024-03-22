package String;

public class P12 {
    public static void main(String[] args) {
        String s="my0 2 na3me4 i56s mee5t an3 sd 45 name999999999999999999 i34s a31 m3e678ee75t";
        String s1="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>=(int)'0'&& (int)s.charAt(i)<=(int)'9'){
                continue;
            }
            else {
               s1+=s.charAt(i);
            }
        }
        System.out.println(s1);
//        s=s.toLowerCase();
//        char[] c=s.toCharArray();
//        int count=0;
//        for (int i=0;i<c.length;i++){
//            if ((int)c[i]>=(int)'0'&& (int)c[i]<=(int)'9'){
//                count++;
//            }
//        }
//        int k=0;
//        char[] c1=new char[c.length-count];
//        for (int i=0;i<s.length();i++){
//            if (c[i]!=(int)'0' && c[i]!=(int)'1'&& c[i]!=(int)'2' && c[i]!=(int)'3'&&c[i]!=(int)'4'&&c[i]!=(int)'5' && c[i]!=(int)'6'&& c[i]!=(int)'7' && c[i]!=(int)'8'&&c[i]!=(int)'9') {
//                c1[k] = s.charAt(i);
//                k++;
//            }
//        }
//        s=new String(c1);
//        System.out.println(s);
    }
}
