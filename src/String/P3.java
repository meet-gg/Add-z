package String;

import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string :");
        String str= sc.nextLine();
        for (int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}
