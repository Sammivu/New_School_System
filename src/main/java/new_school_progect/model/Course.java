package new_school_progect.model;

import new_school_progect.enums.CourseOffer;

public class Course {

    CourseOffer courseOffer;

    public Course(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffer=" + courseOffer +
                '}';
    }
}

