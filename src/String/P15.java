package String;

public class P15 {
    public static void main(String[] args) {
        String s="there01256 9k6j2 9 6";
        s=s.toLowerCase();
        char[] c=s.toCharArray();
        int count=0;
        int count1=0;
        for (int i=0;i<c.length;i++){
            if ((int)c[i]>=(int)'0'&& (int)c[i]<=(int)'9'){
                count++;
            }
            else{
                count1++;
            }
        }
        if(count1==count){
            System.out.println("equal");
            return;
        }
        System.out.println("not equal");
    }
}
