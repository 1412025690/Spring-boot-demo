package com.kkb.controller;

import com.kkb.domain.User;
import com.kkb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @RequestMapping("/all")
    public String all(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("users",list);
        // 跳转classpath:/templates/users.html
        return "users";
    }
}
