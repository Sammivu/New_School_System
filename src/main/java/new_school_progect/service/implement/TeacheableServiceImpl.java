package new_school_progect.service.implement;

import new_school_progect.model.Course;
import new_school_progect.model.Teacher;
import new_school_progect.service.CourseServices;

public class TeacheableServiceImpl implements CourseServices {

    @Override
    public void teachcourse(Teacher teacher, Course course) {

        System.out.println("Fullname: "
                + teacher.getName()
                + "\n"+ "Age: "
                + teacher.getAge()
                + "\n"+ "Gender: "
                + teacher.getGender() + "\n" + "Subject Taught: "+course.getCourseOffer() );
    }


}
