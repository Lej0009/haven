package org.findhavens.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/find")
public class FindController {

    @RequestMapping(value = "")
    public String find(Model model) {
        return "find";
    }
}
