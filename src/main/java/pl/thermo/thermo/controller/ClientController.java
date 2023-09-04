package pl.thermo.thermo.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String saveClient(@Valid @ModelAttribute("client") ClientModel clientModel, BindingResult bindingResult) {
       if (bindingResult.hasErrors()) {
           return "clientPage";
       }
        clientService.saveClient(clientModel);
        return "redirect:/client";
    }

    @PostMapping("/deleteclient")
    public String deleteAllClients() {
        clientService.deleteAllClients();
        return "redirect:/client";
    }


}
