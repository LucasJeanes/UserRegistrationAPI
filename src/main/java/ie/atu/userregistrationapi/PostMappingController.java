package ie.atu.userregistrationapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMappingController {
    @PostMapping("users")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserDetails(@RequestBody User user) {
        System.out.println("User ID: " + user.getUserName());
        System.out.println("User Password: " + user.getPassword());
        return user;
    }
}
