package org.factoriaf5.librito.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}


