package org.example;

public class School {

    public String nameOfSchool;
    public String schoolLocation;
    private int totalNumberOfStudent;
    private int totalNumberOfStaff;
    private int totalAcademicStaff;
    private int totalNonAcademicStaff;

    public String getNameOfSchool() {
        return nameOfSchool="Decagon Institute";
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public String getSchoolLocation() {
        return schoolLocation= "Orchid Road, Lekki II,Lagos State";
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    public int getTotalNumberOfStudent() {
        return totalNumberOfStudent= 500;
    }

    public int getTotalNumberOfStaff() {
        return totalNumberOfStaff=50;
    }

    public int getTotalAcademicStaff() {
        return totalAcademicStaff=35;
    }

    public int getTotalNonAcademicStaff() {
        return totalNonAcademicStaff=15;
    }

    @Override
    public String toString() {
        return "School{" +
                "nameOfSchool='" + nameOfSchool + '\'' +
                ", schoolLocation='" + schoolLocation + '\'' +
                ", totalNumberOfStudent=" + totalNumberOfStudent +
                ", totalNumberOfStaff=" + totalNumberOfStaff +
                ", totalAcademicStaff=" + totalAcademicStaff +
                ", totalNonAcademicStaff=" + totalNonAcademicStaff +
                '}';
    }
}
