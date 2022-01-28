package com.sidnikhin.spring.app;

public class Student {
    private String nameSurname;
    private double avgGrade;
    private int course;
    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", avgGrade=" + avgGrade +
                ", course=" + course +
                '}';
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String nameSurname, double avgGrade, int course) {
        this.nameSurname = nameSurname;
        this.avgGrade = avgGrade;
        this.course = course;
    }

}
