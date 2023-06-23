package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/greeting") //http://localhost:7045/greeting
    public String greeting(@RequestParam(required = false, defaultValue = "World") String name, Model model) {
       model.addAttribute("name", name);
       return "greeting";
    }
}
