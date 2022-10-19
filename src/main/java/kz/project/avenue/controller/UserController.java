package kz.project.avenue.controller;

import kz.project.avenue.domain.User;
import kz.project.avenue.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    public User getInfo(){
        return null;
    }

}
