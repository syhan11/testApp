package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeCtrl {
    @RequestMapping("/design")
    public String design() {
        return "design";
    }

    @RequestMapping("/git")
    public String git() {
        return "git";
    }
}
