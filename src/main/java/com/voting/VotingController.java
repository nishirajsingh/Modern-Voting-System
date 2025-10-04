package com.voting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VotingController {
    
    @Autowired
    private VotingService votingService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerVoter(@RequestParam String name, @RequestParam String aadhaar, 
                               @RequestParam String address, Model model) {
        String result = votingService.registerVoter(name, aadhaar, address);
        model.addAttribute("message", result);
        return "register";
    }

    @GetMapping("/candidates")
    public String candidatesPage(Model model) {
        model.addAttribute("candidates", votingService.getCandidates());
        return "candidates";
    }

    @GetMapping("/vote")
    public String votePage(Model model) {
        model.addAttribute("candidates", votingService.getCandidates());
        return "vote";
    }

    @PostMapping("/vote")
    public String castVote(@RequestParam String voterId, @RequestParam int candidateIndex, Model model) {
        String result = votingService.castVote(voterId, candidateIndex);
        model.addAttribute("message", result);
        model.addAttribute("candidates", votingService.getCandidates());
        return "vote";
    }

    @GetMapping("/results")
    public String resultsPage(Model model) {
        model.addAttribute("candidates", votingService.getResults());
        return "results";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}