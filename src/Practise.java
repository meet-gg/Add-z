public class Practise {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "dex", 100, 50, 60);
        students[1] = new Student(2, "denish", 60, 20, 50);
        students[2] = new Student(3, "harsh", 30, 45, 60);
        students[3] = new Student(4, "het", 55, 50, 50);
        students[4] = new Student(5, "man", 90, 30, 71);

        Student s1 = new Student();
        s1.getTop3Student(students);
    }
}

class Student {
    int rollno;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int totalmark;

    Student() {
    }

    Student(int rollno, String name, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.totalmark = mark1 + mark2 + mark3;
    }

    public void getTop3Student(Student[] students) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        String name1 = "";
        String name2 = "";
        String name3 = "";

        for (int i = 0; i < students.length; i++) {
            if (students[i].totalmark > max1) {
                max3 = max2;
                max2 = max1;
                max1 = students[i].totalmark;
                name3 = name2;
                name2 = name1;
                name1 = students[i].name;
            } else if (students[i].totalmark > max2 && students[i].totalmark != max1) {
                max3 = max2;
                max2 = students[i].totalmark;
                name3 = name2;
                name2 = students[i].name;
            } else if (students[i].totalmark > max3 && students[i].totalmark != max2 && students[i].totalmark != max1) {
                max3 = students[i].totalmark;
                name3 = students[i].name;
            }
        }
        System.out.println("First: " + max1 + " " + name1);
        System.out.println("Second: " + max2 + " " + name2);
        System.out.println("Third: " + max3 + " " + name3);
    }
}
