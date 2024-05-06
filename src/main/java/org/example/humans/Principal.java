package org.example.humans;

import org.example.School;
import org.example.enums.StudentStatus;

public class Principal extends School {


    public StudentStatus studentStatus;
    public Applicant studentAdmitted;
    public Student studentExpelled;
    public Teacher academicStaff;
    public Staff typeOfStaff;


    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(StudentStatus studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Applicant getStudentAdmitted() {
        return studentAdmitted;
    }

    public void setStudentAdmitted(Applicant studentAdmitted) {

        this.studentAdmitted = studentAdmitted;
    }

    public Student getStudentExpelled() {
        return studentExpelled;
    }

    public void setStudentExpelled(Student studentExpelled) {
        this.studentExpelled = studentExpelled;
    }

    public Teacher getAcademicStaff() {
        return academicStaff;
    }

    public void setAcademicStaff(Teacher academicStaff) {
        this.academicStaff = academicStaff;
    }

    public Staff getTypeOfStaff() {
        return typeOfStaff;
    }

    public void setTypeOfStaff(Staff typeOfStaff) {
        this.typeOfStaff = typeOfStaff;
    }


    @Override
    public String toString() {
        return "Principal{" +
                "studentStatus=" + studentStatus +
                ", studentAdmitted=" + studentAdmitted +
                ", studentExpelled=" + studentExpelled +
                ", academicStaff=" + academicStaff +
                ", typeOfStaff=" + typeOfStaff +
                '}';
    }
}
