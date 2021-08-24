package com.hust.hedspi.thefirstspringmvc.controllers;

import com.hust.hedspi.thefirstspringmvc.model.Customer;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
public class CustomerController {

    private static final Logger logger = Logger.getLogger(CustomerController.class);

    @RequestMapping("/create")
    public String createCustomer (Model model) {
        logger.info("chuyen qua man tao customer");
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping(value = "/create-customer")
    public String createCustomer (Model model, @ModelAttribute Customer customer) {
        model.addAttribute("customer", customer);
        return "home";
    }

    @PostMapping(value = "/create-validate")
    public String createWithValidate (@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "create";
        }
        return "home";
    }


}
