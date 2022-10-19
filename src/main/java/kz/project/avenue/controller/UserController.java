package kz.project.avenue.controller;

import kz.project.avenue.domain.User;
import kz.project.avenue.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "api/user/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public User getInfo(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return userService.getInfo();
    }

}
