package com.hust.hedspi.thefirstspringmvc.controllers;

import com.hust.hedspi.thefirstspringmvc.model.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public ModelAndView helloEx() {
        String message = "<br><div style='text-align:center;'>" + "<h3>Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java</div><br><br>";
        return new ModelAndView("hello", "message", message);
    }

    @RequestMapping("/helloworld")
    public String handler(Model model) {

        Hello hello = new Hello();
        hello.setMessage("Hello World Example Using Spring MVC 5!!!");
        hello.setDateTime("13/09/1999");
        model.addAttribute("helloWorld", hello);
        return "helloworld";
    }
}

