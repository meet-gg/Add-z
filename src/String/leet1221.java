package String;

public class leet1221 {
    public static void main(String[] args) {
//       String[] word1 = {"ab", "c"};
       String str="G()(al)";
//        StringBuilder b1=new StringBuilder();
//        StringBuilder b2=new StringBuilder();
//        for(int i=0;i<word1.length;i++){
//            b1.append(i);
//        }
    str= str.replace("(","");
        System.out.println(str.replace(")",""));
    }
}
