package com.tripdeal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String home(Model model){
        model.addAttribute("title","Users");
        return "user-page";
    }
}
