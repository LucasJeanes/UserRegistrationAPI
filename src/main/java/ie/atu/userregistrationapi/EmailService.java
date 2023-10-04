package ie.atu.userregistrationapi;

import org.springframework.stereotype.Service;

@Service    //A Spring keyword to look for this class when called.
public class EmailService {
    public String sendEmail(String name, String email){
        return "Welcome to the network, " + name + ". Your email is: " + email;
        //The only method in this class is sendEmail, which takes the values passed through and returns the following String
    }
}
