package pl.thermo.thermo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.thermo.thermo.models.ClientModel;
import pl.thermo.thermo.services.ClientService;

@Controller
public class ClientController {


    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client")
    public String clientPage(Model model) {
        model.addAttribute("client", new ClientModel());
        return "clientPage";
    }

    @PostMapping("/saveclient")
    public String saveClient(@ModelAttribute("client") ClientModel clientModel) {
        clientService.saveClient(clientModel);
        return "redirect:/admin/clients";
    }




}
