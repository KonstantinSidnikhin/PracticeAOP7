package com.sidnikhin.spring.app.Aspects;

import com.sidnikhin.spring.app.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UniversityLoggingAspect {
    @Before("execution(* getStudent())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("Логируем получение списка студентов перед методом getStudents");

    }
    @AfterReturning(pointcut="execution(* getStudent())",returning="students")
    public void afterGetStudentsLoggingAdvice(List<Student>students){
        Student firstStudent=students.get(0);
        String nameSurname=firstStudent.getNameSurname();
        nameSurname="Mr"+nameSurname;
        firstStudent.setNameSurname(nameSurname);
        double avgGrade=firstStudent.getAvgGrade();
        avgGrade=avgGrade+1;
        firstStudent.setAvgGrade(avgGrade);


        System.out.println("Логируем получение списка студентов после метода getStudents");

    }
}
