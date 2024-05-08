package new_school_progect.service.implement;

import com.sun.security.jgss.GSSUtil;
import new_school_progect.model.Applicant;
import new_school_progect.service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {

    public void displayApplicantData(Applicant applicant) {
        System.out.println("Fullname: "+applicant.getName()+ "\n"
                + "Age: "+ applicant.getAge()+"\n"
                + "Gender: "+ applicant.getGender() );
    }


    public void admitApplicant (Applicant applicant) {
        if (applicant.getAge()>= 18){
            System.out.println("CONGRATULATIONS!! YOU ARE ADMITTED..");
        }else {
            System.out.println("YOU ARE NOT ADMITTED");
        }

    }
}
