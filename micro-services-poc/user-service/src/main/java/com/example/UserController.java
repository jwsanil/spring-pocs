package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserDetailsServiceClient userDetailsServiceClient;

    public UserController(UserDetailsServiceClient userDetailsServiceClient) {
        this.userDetailsServiceClient = userDetailsServiceClient;
    }

    @GetMapping
    public User getUserDetails(@RequestParam String id) {

        User user = new User();
        user.setId("101");
        user.setCity("Hyd");
        user.setName("Anil");
        return user;
    }


    @GetMapping("/additional")
    public UserAdditonalDetails getUserAdditionalDetails(@RequestParam String id) {
        return userDetailsServiceClient.getUserAdditonalDetails(id);
    }
}
