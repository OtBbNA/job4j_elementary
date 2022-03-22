package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setOwner("Anton Kostylev");
        student.setGroup("2B");
        student.setStart(new Date());
        System.out.println(student.getOwner() + " student of group " + student.getGroup() + ", started studying on " + student.getStart());
    }
}
