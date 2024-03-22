package String;

public class P2 {
    public static void main(String[] args) {
        String s="Hanumannnasfdfg";
        char[] c=s.toCharArray();
        int left=0,right=c.length-5;
        while (left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        s=new String(c);
        System.out.println(s);
    }
}
