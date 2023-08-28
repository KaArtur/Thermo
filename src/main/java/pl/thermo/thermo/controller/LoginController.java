package pl.thermo.thermo.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.thermo.thermo.models.UserModel;
import pl.thermo.thermo.services.UserService;


@Controller
public class LoginController {

    private UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new UserModel());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UserModel user, Model model, HttpSession session) {
        UserModel foundUser = userService.getUserByUsername(user.getUsername());

        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            session.setAttribute("loggedInUser", foundUser.getUsername());
            return "redirect:/admin";
        } else {
            model.addAttribute("error", true);
            return "login";
        }
    }

}
