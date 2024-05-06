package org.example.humans;

import org.example.enums.Department;

public class Applicant extends Person{
    public boolean applicationStatus;
    public int applicantAge;
    public Department preferedDepartment;

    public boolean isApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(boolean applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
            this.applicantAge = applicantAge;
    }

    public Department getPreferedDepartment() {
        return preferedDepartment;
    }

    public void setPreferedDepartment(Department preferedDepartment) {
        this.preferedDepartment = preferedDepartment;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicationStatus=" + applicationStatus +
                ", applicantAge=" + applicantAge +
                ", preferedDepartment=" + preferedDepartment +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
