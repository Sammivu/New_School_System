package org.example.humans;

import org.example.enums.Classes;
import org.example.enums.Course;
import org.example.enums.Department;

public class Student extends Person{

    public Course offeredSubject;
    public Classes studentClass;
    public Department studentDepartment;

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

    @Override
    public String toString() {
        return "Student{" +
                "offeredSubject=" + offeredSubject +
                ", studentClass=" + studentClass +
                ", studentDepartment=" + studentDepartment +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
