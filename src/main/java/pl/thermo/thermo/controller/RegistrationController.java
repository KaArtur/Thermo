package pl.thermo.thermo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.thermo.thermo.models.UserModel;
import pl.thermo.thermo.services.UserService;

@Controller
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String registrationForm(Model model) {
        model.addAttribute("user", new UserModel());
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("user") UserModel userModel) {
        userService.registerUser(userModel.getUsername() , userModel.getPassword());
        return "redirect:/login";
    }

}
