package oop;

public class student {
    int rollnum;
    String studname;
    int mark1;
    int mark2;
    int mark3;
    int totalmarks;

    void  setStudDetails(int r,String stun,int m1,int m2,int m3){
        rollnum=r;
        studname=stun;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
 void calculatetotalmarks(){
       totalmarks=mark1+mark2+mark3;
    }
    void DisplaystudentDetails(){
        System.out.println(rollnum);
        System.out.println(studname);
        System.out.println(totalmarks);
    }
}
class Studentdemo{
    public static void main(String[] args) {
        student s1=new student();
        s1.setStudDetails(10,"urvish",200000000,5005,3);
        s1.calculatetotalmarks();
        s1.DisplaystudentDetails();

    }
}