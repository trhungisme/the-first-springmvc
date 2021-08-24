package com.hust.hedspi.thefirstspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class PageController {
    @GetMapping(value = {"", "/", "/home"})
    public String home(Locale locale, Model model) {
        return "home";
    }

    @GetMapping(value = "/about")
    public String about(Locale locale, Model model) {
        return "about";
    }
}
