package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform")
    //@request takes "login"  stores it into String login, then login is stored in loginval
    public String loadFromPage(@RequestParam("login") String login, Model model) {
        model.addAttribute ("loginval", login);
        return "confirm";
    }
}
