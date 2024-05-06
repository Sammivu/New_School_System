package org.example.humans;

import java.util.Arrays;

public class Staff {

    String [] AcademicStaff={"Teachers", "Instructors"};
    String [] NonAcademicStaff= {"Janitors", "Drivers", "Bursar", "Securities", "Medical_Personnel"};

    public String[] getAcademicStaff() {
        return AcademicStaff;
    }

    public void setAcademicStaff(String[] academicStaff) {
        AcademicStaff = academicStaff;
    }

    public String[] getNonAcademicStaff() {
        return NonAcademicStaff;
    }

    public void setNonAcademicStaff(String[] nonAcademicStaff) {
        NonAcademicStaff = nonAcademicStaff;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "AcademicStaff=" + Arrays.toString(AcademicStaff) +
                ", NonAcademicStaff=" + Arrays.toString(NonAcademicStaff) +
                '}';
    }
}
