package com.example.demo.Login.controllers;

import com.example.demo.Fiszki.service.FlashcardSetService;
import com.example.demo.Login.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {

    UserService userService;
    FlashcardSetService flashcardSetService;

    @GetMapping("/{id}")
    public String registrationForm(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        long id = userService.findUserByEmail(authentication.getName()).getId();
        model.addAttribute("flashcards", flashcardSetService.findAllByUser(userService.findUserByEmail(authentication.getName()).getUsername()));
        return "user";
    }
}
