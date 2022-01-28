package com.sidnikhin.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    List<Student> students =new ArrayList<>();
    public void addStudent(){
        Student student1=new Student("Zaur Tregulov",8.1,4);
        Student student2=new Student("Evelina Gaube",7.9,2);
        Student student3=new Student("Tory Maybache",6.8,3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    public List<Student> getStudent(){
        System.out.println("information from method getStudent");
        System.out.println(students);
        return students;
    }
}
