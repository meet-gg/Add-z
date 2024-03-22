package String;

public class P14 {
    public static void main(String[] args) {
        String s="mymym naan isisisis asasa teeeeeeeeeeeeeeeeeeeeeeeeet";
        String[] a= s.split(" ");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length();j++){
                if (a[i].charAt(j)!=a[i].charAt(a[i].length()-1-j)){
                    System.out.println("not palindrome");
                    return;
                }
            }
        }
        System.out.println("palindrome");
    }
}
