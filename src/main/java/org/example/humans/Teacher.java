package org.example.humans;

import org.example.enums.Classes;

import java.util.Arrays;


public class Teacher extends Person {

    public Classes classTaught;
    String [] subjectsTaught= {"Mathematics", "English", "Biology", "Geography", "Government","Accounting"};

    public Classes getClassTaught() {
        return classTaught;
    }

    public void setClassTaught(Classes classTaught) {
        this.classTaught = classTaught;
    }

    public String[] getSubjectsTaught() {
        return subjectsTaught;
    }

    public void setSubjectsTaught(String[] subjectsTaught) {
        this.subjectsTaught = subjectsTaught;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "classTaught=" + classTaught +
                ", subjectsTaught=" + Arrays.toString(subjectsTaught) +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
