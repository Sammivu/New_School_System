package new_school_progect;

import new_school_progect.enums.CourseOffer;
import new_school_progect.enums.Genda;
import new_school_progect.model.*;
import new_school_progect.service.implement.ApplicantServiceImpl;
import new_school_progect.service.implement.PrincipalServiceImpl;
import new_school_progect.service.implement.StudentServiceImpl;
import new_school_progect.service.implement.TeacheableServiceImpl;

public class NewSchoolSystem {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Sampson Gbewa", 32, Genda.FEMALE);
        TeacheableServiceImpl teacheableService1 = new TeacheableServiceImpl();
        Course course1 = new Course(CourseOffer.ECONOMICS);
        System.out.println("Teacher data: ");
        teacheableService1.teachcourse(teacher1,course1);
        System.out.println("************************");

        Student expelledStudent = new Student("Hamlet Alabo", 23, Genda.MALE);
        StudentServiceImpl studentService = new StudentServiceImpl();
        Principal principal =new Principal("Emeka Okoro", 70 ,Genda.MALE);
        Course course2 = new Course(CourseOffer.PHYSICS);
        System.out.println("Expelled student data");
        studentService.displayExplledStudent(expelledStudent,course2, principal);
        System.out.println("************************");

        System.out.println("Principal Data");
        PrincipalServiceImpl principalService =new PrincipalServiceImpl();
        principalService.displayPrincipalData(principal);
        System.out.println("************************");

        System.out.println("Applicant Data" );
        Applicant applicant = new Applicant("Folake Oladejo", 19, Genda.FEMALE);
        ApplicantServiceImpl applicantService = new ApplicantServiceImpl();
        applicantService.displayApplicantData(applicant);
        System.out.println("************************");


        System.out.println("Successful Admission Data");
        Applicant applicant1 = new Applicant("Jennifer", 12, Genda.FEMALE);
        applicantService.admitApplicant(applicant1);
        System.out.println("************************");

    }
}
