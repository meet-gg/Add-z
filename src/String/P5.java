package String;

import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string :");
        String s=sc.nextLine();
        System.out.print("Enter the second string :");
        String s1=sc.nextLine();
        if(s.length()!=s1.length()){
            System.out.println("Strings are not equals");
            return;
        }
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==s1.charAt(i)){
                count++;
            }
        }
        if (count==s.length()){
            System.out.println("Strings are Equals");
        }
        else {
            System.out.println("Strings are not equals");
        }
    }
}
