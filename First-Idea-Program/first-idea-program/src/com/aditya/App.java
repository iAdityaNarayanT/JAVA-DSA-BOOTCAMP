package com.aditya;

public class App {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.firstName="Aditya Narayan Tiwari";
        myStudent.age=20;
        myStudent.roll_no=03;
        myStudent.branch="CSE-DS";
        myStudent.grade="A++";
        myStudent.marks=847;
        myStudent.onProbabation=false;
        myStudent.percentage=93.5;
        System.out.print("Your name is: " + myStudent.firstName);
    }
}
