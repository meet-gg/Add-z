package String;
public class P10 {
    public static void main(String[] args) {
        String s="my name is meet";
        String[] s1=s.split(" ");
        String s2="";
        for(int i=0;i<s1.length;i++){
                char[] c=s1[i].toCharArray();
                int left=0,right=s1[i].length()-1;
                while (left<right){
                    char temp=c[left];
                    c[left]=c[right];
                    c[right]=temp;
                    left++;
                    right--;
                }
                s=new String(c);
                s2=s2+s+" ";
        }
        System.out.println(s2.trim());
    }
}
