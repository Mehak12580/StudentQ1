package com.kiet.studentq1.model;

import java.util.Arrays;

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student(
                101,
                "Mehak",
                "mehak@gmail.com",
                "CSE AI/ML",
                90,
                85,
                Arrays.asList("Java", "Python", "Spring Boot")
        );

        System.out.println(s1);

        System.out.println("Student ID: " + s1.getStudentId());

        System.out.println("Student Name: " + s1.getStudentName());

        s1.setProgrammingScore(95);

        System.out.println("Updated Programming Score: "
                + s1.getProgrammingScore());

        System.out.println("Technical Skills: "
                + s1.getTechnicalSkills());
    }
}
