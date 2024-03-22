package HashMapSet;

import java.util.HashSet;
import java.util.Objects;

public class deepinset {
    public static void main(String[] args) {
        HashSet<student> stu=new HashSet<>();
        student s1=new student(1,"meet");
        student s2=new student(2,"urvish");
        student s3=new student(1,"meet");
        student s4=new student(1,"meet");
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        System.out.println(stu.size());
    }
}
class student{
    int roll;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return roll == student.roll && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    public student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
