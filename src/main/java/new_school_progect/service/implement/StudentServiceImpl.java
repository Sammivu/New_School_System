package new_school_progect.service.implement;

import new_school_progect.model.Course;
import new_school_progect.model.Principal;
import new_school_progect.model.Student;
import new_school_progect.service.StudentService;

public class StudentServiceImpl implements StudentService {


    @Override
    public void displayExplledStudent(Student student, Course course, Principal principal) {
        System.out.println("Name of Student: "+ student.getName()+ "\n"+ "Age: "+ student.getAge()+"\n"
                + "Genda: "+ student.getGender()
                + "\n"
                +"Subject Offered: "+ course.getCourseOffer()+"\n"
                + "Expelled by Principal: "+principal.getName());

    }
}
