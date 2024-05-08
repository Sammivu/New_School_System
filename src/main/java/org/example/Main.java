package org.example;

import org.example.enums.*;
import org.example.humans.*;

import java.nio.channels.Selector;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Teacher teacher =  new Teacher();
        String name = scan.nextLine();
        teacher.setName(name);

        System.out.println("Enter Age: ");
        int age = scan.nextInt();
        teacher.setAge(age);

        //  System.out.println("Enter your Gender: ");
        //   String gender = scan.next();
        int choice;
        String sex;
        System.out.println("Gender");
        System.out.println("1: Male");
        System.out.println("2: Female");
        System.out.println("Select a number");
        choice= scan.nextInt();

        //Logic statement for the selection

        switch (choice){
            case 1:
                sex="Male";
                break;
            case 2:
                sex =" Female";
                break;
            default:
                sex= "Not in the options";
                break;

        }
        teacher.setGender(sex);

        //Selecting Teacher class


        teacher.getSubjectsTaught();


        Applicant applicant = new Applicant();
        applicant.setName(name);
        applicant.setApplicantAge(age);
      /*  System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter Age: ");
        int age = scan.nextInt();


         System.out.println("Enter your Gender: ");
          String gender = scan.next();
*/

     /*   int choice;
        String gender;
        System.out.println("Gender");
        System.out.println("1: Male");
        System.out.println("2: Female");

        System.out.println("Select a number");
        choice= scan.nextInt();

        //Logic statement for the selection

        switch (choice){
            case 1:
                gender="Male";
                break;
            case 2:
                gender =" Female";
                break;
            default:
                gender= "Not in the options";
                break;

        }*/
        applicant.setGender(sex);

        applicant.setPreferedDepartment(Department.Science);
        applicant.setApplicationStatus(true);

        Staff staff =new Staff();
        staff.getAcademicStaff();
        staff.getNonAcademicStaff();

        Student student1 = new Student();
        student1.setName("James Tamuno");
        student1.setStudentClass(Classes.SS1);
        student1.setStudentDepartment(Department.Technical_Science);
        student1.setStudentSex(Gender.MALE);
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
            principal.setStudentStatus(StudentStatus.ADMITTED);
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

        }else if (String.valueOf(role).equalsIgnoreCase("teacher")) {
            int option;
            String classes;
            System.out.println("Class Taught");
            System.out.println("1: JSS1");
            System.out.println("2: JSS2");
            System.out.println("3: JSS3");
            System.out.println("Select a number");
            option= scan.nextInt();

            //Logic statement for the selection

            switch (option){
                case 1:
                    classes="JSS1";
                    break;
                case 2:
                    classes ="JSS2";
                    break;
                case 3:
                    classes= "JSS3";
                    break;
                default:
                    classes= "Not in the options";
                    break;

            }
            teacher.setClassTaught(classes);

            System.out.println(teacher);
        }else if (String.valueOf(role).equalsIgnoreCase("student")) {
            System.out.println(student1);

        } else if (String.valueOf(role).equalsIgnoreCase("applicant")) {

            System.out.println(applicant);

        } else{
            System.out.println("Non-Academic Staff "+staff);
            System.out.println("Can not access student records!!");
        }


    }
}
