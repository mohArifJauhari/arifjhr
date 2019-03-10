package com.jabejo.arifjhr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MainController
 */
@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}