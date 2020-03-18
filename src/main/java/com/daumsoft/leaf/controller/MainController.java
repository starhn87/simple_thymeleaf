package com.daumsoft.leaf.controller;

import com.daumsoft.leaf.vo.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/user")
    public String start() {
        // User user = new User("starhn87", "1234", "Lee Seungwoo", "web");
        // model.addAttribute("user", user);
        logger.info("start!!!");
        return "test";
    }
}