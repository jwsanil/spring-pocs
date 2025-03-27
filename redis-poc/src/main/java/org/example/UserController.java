package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        User userById = userService.getUserById(id);
        return userById.getUsername();
    }

    @PostMapping
    public String SaveUser(@RequestBody User user) {

        return null;
    }
}
