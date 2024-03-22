package array;

import java.util.Arrays;
import java.util.Scanner;

class student34 {
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    int[] rollNo = new int[5];
    String[] Name = new String[5];
    int[] marks1 = new int[5];
    int[] marks2 = new int[5];
    int[] marks3 = new int[5];
    int[] totalMarks = new int[5]; // Added array to store total marks
    int[] ans = new int[5];

    void set() {
        for (int i = 0; i < 5; i++) {
            Name[i] = sc.nextLine();
            rollNo[i] = sc.nextInt();
            marks1[i] = sc.nextInt();
            marks2[i] = sc.nextInt();
            marks3[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    void calculate() {
        for (int i = 0; i < 5; i++) {
            totalMarks[i] = marks1[i] + marks2[i] + marks3[i];
            ans[i] = totalMarks[i];
        }
        Arrays.sort(ans);
    }

    void displayDetails() {
//        Arrays.sort(ans);
        for (int i = 4; i >= 2; i--) {
            for (int j = 0; j < 5; j++) {
                if (totalMarks[j]==ans[i]) {
                    System.out.println("Name: " + Name[j]);
                    System.out.println("Roll No: " + rollNo[j]);
                    System.out.println("Marks 1: " + marks1[j]);
                    System.out.println("Marks 2: " + marks2[j]);
                    System.out.println("Marks 3: " + marks3[j]);
                    System.out.println("Total Marks: " + totalMarks[j]); // Display total marks

                }
            }
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        student34 s1 = new student34();
        s1.set();
        s1.calculate();
        s1.displayDetails();
    }
}
