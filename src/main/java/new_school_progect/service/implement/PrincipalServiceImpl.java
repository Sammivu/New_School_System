package new_school_progect.service.implement;

import new_school_progect.model.Principal;
import new_school_progect.service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {

    @Override
    public void displayPrincipalData(Principal principal) {
        System.out.println("Principal Name: "+ principal.getName()+"\n"
                + "Age: "+ principal.getAge()+ "\n"
                + "Gender: "+ principal.getGender());
    }
}
