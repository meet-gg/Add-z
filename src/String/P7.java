package String;

public class P7 {
    public static void main(String[] args) {
        String s="meetg";
        char[] c=s.toCharArray();
        for(int i=0;i<c.length-1;i++){
            for (int j=0;j< c.length-1-i;j++){//aya num.length-1-i ni jagyaae num.lengh lakhavi to pn chale kem ke aagla sort hoy ne loop vadhare no chale aetle aapde -1-i karvi chavi
                if (c[j]>c[j+1]){
                    char temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        s=new String(c);
        System.out.println(s);
    }
}
