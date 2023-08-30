package pl.thermo.thermo.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.thermo.thermo.models.ClientModel;
import pl.thermo.thermo.models.UserModel;
import pl.thermo.thermo.services.ClientService;
import pl.thermo.thermo.services.UserService;

import java.util.List;

@Controller
public class AdminController {

    private final UserService userService;
    private final ClientService clientService;

    public AdminController(UserService userService, ClientService clientService) {
        this.userService = userService;
        this.clientService = clientService;
    }

    @GetMapping("/admin")
    public String adminPanel(Model model, HttpSession session, @ModelAttribute("client") ClientModel clientModel) {
        String loggedInUser = (String) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            UserModel user = userService.getUserByUsername(loggedInUser);
            model.addAttribute("loggedInUser", user);
        } else {
            return "redirect:/login";
        }

        List<ClientModel> clients = clientService.getAllClient();
        model.addAttribute("clients", clients);

        return "adminPage"; // Zwróć nazwę widoku Thymeleaf dla strony admina
    }


}
