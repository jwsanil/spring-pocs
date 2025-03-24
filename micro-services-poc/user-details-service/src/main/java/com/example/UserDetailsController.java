package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users-additional-details")
public class UserDetailsController {

    @GetMapping
    public UserAdditonalDetails getUserAdditonalDetails(@RequestParam String id) {

        UserAdditonalDetails userAdditonalDetails = new UserAdditonalDetails();
        User user = new User();

        user.setId("101");
        user.setCity("Hyd");
        user.setName("Anil");
        userAdditonalDetails.setUser(user);
        userAdditonalDetails.setDesignation("Software Engineer");
        userAdditonalDetails.setIndustryType("IT");

        return userAdditonalDetails;
    }
}
