package com.portfolio.portfolioSample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/education")
    public String showEducation() {
        return "education";
    }

    @GetMapping("/superpowers")
    public String showSuperpowers() {
        return "superpowers";
    }

    @GetMapping("/work")
    public String showWork() {
        return "work";
    }
}
