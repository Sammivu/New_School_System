package org.example.humans;

import org.example.enums.Classes;
import org.example.enums.Course;
import org.example.enums.Department;
import org.example.enums.Gender;

public class Student extends Person{

    public Course offeredSubject;
    public Classes studentClass;
    public Department studentDepartment;
    public Gender studentSex;

    public Course getOfferedSubject() {
        return offeredSubject;
    }

    public void setOfferedSubject(Course offeredSubject) {
        this.offeredSubject = offeredSubject;
    }

    public Classes getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Classes studentClass) {
        this.studentClass = studentClass;
    }

    public Department getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(Department studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public Gender getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Gender studentSex) {
        this.studentSex = studentSex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "offeredSubject=" + offeredSubject +
                ", studentClass=" + studentClass +
                ", studentDepartment=" + studentDepartment +
                ", studentSex=" + studentSex +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
