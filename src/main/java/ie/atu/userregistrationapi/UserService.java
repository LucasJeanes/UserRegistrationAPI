package ie.atu.userregistrationapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //This keyword highlights to Spring that this class can be auto-run when called
public class UserService {
        private EmailService emailService;
        //Create a local reference for EmailService to be used later.

    @Autowired  //This keyword highlights to Spring that the EmailService class could be needed and assigns the tag to the object.
    public void userService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String registerUser(String name, String email) {
        //user registration logic

        //send confirmation email
        return emailService.sendEmail(name, email);
        //Instead of saving the name/email, it automatically gets passed through UserService to the emailService method and returns
    }
}
