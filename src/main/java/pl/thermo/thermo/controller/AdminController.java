package pl.thermo.thermo.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.thermo.thermo.models.UserModel;
import pl.thermo.thermo.services.ClientService;
import pl.thermo.thermo.services.UserService;

@Controller
public class AdminController {

    private final UserService userService;
    private final ClientService clientService;

    public AdminController(UserService userService, ClientService clientService) {
        this.userService = userService;
        this.clientService = clientService;
    }

    @GetMapping("/admin")
    public String adminPanel(Model model, HttpSession session) {
        String loggedInUser = (String) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            UserModel user = userService.getUserByUsername(loggedInUser);
            model.addAttribute("loggedInUser", user);
            return "adminPage"; // Zwróć nazwę widoku Thymeleaf dla strony admina
        } else {
            return "redirect:/login"; // Jeśli użytkownik nie jest zalogowany, przekieruj go do strony logowania
        }
    }

    @GetMapping("/admin/clients")
    public String listClient(Model model) {
        model.addAttribute("clients", clientService.getAllClient());
        return "adminPage";
    }

}
