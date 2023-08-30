package pl.thermo.thermo.controller;

import jakarta.servlet.http.HttpSession;
import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.thermo.thermo.models.ClientModel;
import pl.thermo.thermo.models.PartnershipModel;
import pl.thermo.thermo.models.UserModel;
import pl.thermo.thermo.services.ClientService;
import pl.thermo.thermo.services.PartnershipService;
import pl.thermo.thermo.services.UserService;

import java.util.List;

@Controller
public class AdminController {

    private final UserService userService;
    private final ClientService clientService;
    private final PartnershipService partnershipService;

    public AdminController(UserService userService, ClientService clientService, PartnershipService partnershipService) {
        this.userService = userService;
        this.clientService = clientService;
        this.partnershipService = partnershipService;
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

        List<PartnershipModel> partners = partnershipService.getAllPartner();
        model.addAttribute("partners", partners);

        return "adminPage"; // Zwróć nazwę widoku Thymeleaf dla strony admina
    }

    @PostMapping("/admin/deleteClient")
    public String deleteClient(@RequestParam("clientId") Long clientId) {
        clientService.deleteClientById(clientId);
        return "redirect:/admin";
    }

    @PostMapping("/admin/deletePartner")
    public String deletePartner(@RequestParam("partnerId") Long partnerId) {
        partnershipService.deletePartnerById(partnerId);
        return "redirect:/admin"; // Przekierowanie na stronę z zaktualizowanymi danymi
    }


    @PostMapping("/admin/update-partner")
    public String updatePartner(@ModelAttribute("partner") PartnershipModel partnerModel) {
        partnershipService.savePartner(partnerModel);
        return "redirect:/admin"; // Przekierowanie na stronę z zaktualizowanymi danymi
    }

}
