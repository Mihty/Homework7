package org.example;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("John", "Doe", "Group A", 4.5);
        students[1] = new Aspirant("Alice", "Smith", "Group B", 5.0, "Some scientific work");

        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + ": Scholarship - " + student.getScholarship() + " грн");
        }
    }
}