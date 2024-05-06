package org.example;

import org.example.enums.*;
import org.example.humans.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Teacher teacher =  new Teacher();
        teacher.setName("Juliet Kenny");
        teacher.setClassTaught(Classes.JSS2);
        teacher.setGender(Gender.FEMALE);
        teacher.setAge(35);
        teacher.getSubjectsTaught();

        Applicant applicant = new Applicant();
        applicant.setName("Fred Onyeka");
        applicant.setApplicantAge(20);
        applicant.setGender(Gender.MALE);
        applicant.setPreferedDepartment(Department.Science);
        applicant.setApplicationStatus(true);

        Staff staff =new Staff();
        staff.getAcademicStaff();
        staff.getNonAcademicStaff();

        Student student1 = new Student();
        student1.setName("James Tamuno");
        student1.setStudentClass(Classes.SS1);
        student1.setStudentDepartment(Department.Technical_Science);
        student1.setGender(Gender.MALE);
        student1.setAge(13);
        student1.setOfferedSubject(Course.MATHEMATICS);
        student1.setOfferedSubject(Course.PHYSICS);

        School school = new School();
        school.getNameOfSchool();
        school.getSchoolLocation();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter your role: ");
        String role = scan2.next();

        if (String.valueOf(role).equalsIgnoreCase("principal")) {


            //Security to grant access depending on your role
            // Limited information depending on your role


            school.getTotalAcademicStaff();
            school.getTotalNonAcademicStaff();
            school.getTotalNumberOfStudent();
            school.getTotalNumberOfStaff();

            Principal principal = new Principal();

            //Condition for Principal to admit applicant
            if ((applicant.applicantAge >= 7)&& (applicant.applicantAge<=18)) {
                principal.setStudentStatus(StudentStatus.ADMITTED);
                principal.setStudentAdmitted(applicant);
            } else {
                principal.setStudentStatus(StudentStatus.PENDING);
                System.out.println("Not Admitted Yet!");
            }


            principal.setStudentExpelled(student1);
            principal.setAcademicStaff(teacher);
            principal.setTypeOfStaff(staff);


            System.out.println(school);
            System.out.println(principal);

        }else if (String.valueOf(role).equalsIgnoreCase("teacher")){
            System.out.println(teacher);
        } else{
            System.out.println("Non-Academic Staff "+staff);
            System.out.println("Can not access student records!!");
        }


    }
}
