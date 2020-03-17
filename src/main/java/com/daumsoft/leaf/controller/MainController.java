package com.daumsoft.leaf.controller;

import com.daumsoft.leaf.vo.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/user")
    public String start(Model model) {
        User user = new User("starhn87", "1234", "Lee Seungwoo", "web");
        model.addAttribute("user", user);
        System.out.println(model);
        return "test";
    }
}