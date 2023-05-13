package org.school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher John = new Teacher(1,"John",500);
        Teacher Jacob = new Teacher(2,"Jacob",700);
        Teacher Jingleheimer = new Teacher(3,"Jingleheimer",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(John);
        teacherList.add(Jacob);
        teacherList.add(Jingleheimer);


        Student Schmidt = new Student(1,"Schmidt",4);
        Student Smithers = new Student(2,"Smithers",12);
        Student Homer = new Student(3,"Homer",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Schmidt);
        studentList.add(Homer);
        studentList.add(Smithers);




        School shs = new School(teacherList,studentList);

        Teacher Rick = new Teacher(6,"Rick", 900);

        shs.addTeacher(Rick);


        Schmidt.payFees(5000);

        Smithers.payFees(6000);

        System.out.println("Sterling Heights High school has earned $"+ shs.getTotalMoneyEarned());

        System.out.println("------ School Pays The Salary----");

        John.receiveSalary(John.getSalary());

        System.out.println("Sterling Heights High school has spent for salary to " + John.getName()  +" and now has $" + shs.getTotalMoneyEarned());

        Jingleheimer.receiveSalary(Jingleheimer.getSalary());

        System.out.println("Sterling Heights High school has spent for salary to " + Jingleheimer.getName()  +" and now has $" + shs.getTotalMoneyEarned());


        System.out.println(Smithers);

        Jacob.receiveSalary(Jacob.getSalary());

        System.out.println(Jacob);


    }
}