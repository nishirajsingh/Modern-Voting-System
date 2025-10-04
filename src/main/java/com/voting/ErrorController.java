package com.voting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model) {
        model.addAttribute("errorMessage", "An unexpected error occurred. Please try again.");
        return "error";
    }
}