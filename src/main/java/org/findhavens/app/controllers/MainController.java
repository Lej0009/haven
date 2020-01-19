package org.findhavens.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = "")
    public String welcome(Model model) {
        return "index";
    }
}