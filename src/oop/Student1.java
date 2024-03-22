package oop;

import java.util.Scanner;

class Student1 {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] rollNo = new int[n];
    String[] Name = new String[n];
    int[] marks1 = new int[n];
    int[] marks2 = new int[n];
    int[] marks3 = new int[n];
    int[] totalMarks = new int[n]; // Added array to store total marks

    void set() {
        for (int i = 0; i < n; i++) {
            sc = new Scanner(System.in);
            Name[i] = sc.nextLine();
            rollNo[i] = sc.nextInt();
            marks1[i] = sc.nextInt();
            marks2[i] = sc.nextInt();
            marks3[i] = sc.nextInt();
        }
    }

    void calculate() {
        for (int i = 0; i < n; i++) {
            totalMarks[i] = marks1[i] + marks2[i] + marks3[i];
        }
    }

    void displayDetails() {
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + Name[i]);
            System.out.println("Roll No: " + rollNo[i]);
            System.out.println("Marks 1: " + marks1[i]);
            System.out.println("Marks 2: " + marks2[i]);
            System.out.println("Marks 3: " + marks3[i]);
            System.out.println("Total Marks: " + totalMarks[i]); // Display total marks
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.set();
        s1.calculate();
        s1.displayDetails();
    }
}
