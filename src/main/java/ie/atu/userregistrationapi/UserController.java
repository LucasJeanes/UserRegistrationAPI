package ie.atu.userregistrationapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired      //Keyword tells Spring to look for the service called UserService and assigns a reference tag
    public void SetUserService(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/registerUser/{name}/{email}") //Spring retrieves specified information in the URL with these tags
    public String details(@PathVariable String name, @PathVariable String email) {
        return userService.registerUser(name, email);
        //The name and email is retrieved from the URL and passed through the userService method to register user
        //This method returns the email value which is passed up from EmailService.
    }
}
