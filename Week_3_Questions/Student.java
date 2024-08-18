import java.util.Scanner;

public class Student {
    String name;
    int rollNo , marks;
    Student(String n, int rN, int m) {
        this.name = n;
        this.rollNo  = rN;
        this.marks = m;
    }
    public void CalculateGrade() {
        System.out.println("Name : "+name);
        System.out.println("Roll No. : "+rollNo);
        if(marks>90 && marks<=100) {
            System.out.println("Grade : O");
        } else if(marks>80 && marks<=90) {
            System.out.println("Grade : A");
        } else if(marks>70 && marks<=80) {
            System.out.println("Grade : B");
        } else if(marks>60 && marks<=70) {
            System.out.println("Grade : C");
        } else if(marks>50 && marks<=60) {
            System.out.println("Grade : 0");
        } else {
            System.out.println("Grade : F");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, rollno & marks of the student : ");
        String n = sc.nextLine();
        int rN = sc.nextInt();
        int m = sc.nextInt();
        Student S1 = new Student(n, rN, m);
        S1.CalculateGrade();
    }
}
