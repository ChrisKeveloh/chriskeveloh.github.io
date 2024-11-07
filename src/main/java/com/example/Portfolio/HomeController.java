package com.example.Portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


     @GetMapping("/")
    public String home() {
        return "index";  // This corresponds to home.html in src/main/resources/templates
    }


    @GetMapping("/About")
    public String About() {
        return "About";  // This corresponds to home.html in src/main/resources/templates
    }

    @GetMapping("/Coursework")
    public String Coursework() {
        return "Coursework";  // This corresponds to home.html in src/main/resources/templates
    }

    @GetMapping("/Projects")
    public String Projects() {
        return "Projects";  // This corresponds to home.html in src/main/resources/templates
    }
    
}
