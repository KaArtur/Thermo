package pl.thermo.thermo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.thermo.thermo.models.PartnershipModel;
import pl.thermo.thermo.services.PartnershipService;

@Controller
public class PartnerController {

    private final PartnershipService partnershipService;

    public PartnerController(PartnershipService partnershipService) {
        this.partnershipService = partnershipService;
    }

    @GetMapping("/partner")
    public String partnerPage(Model model) {
        model.addAttribute("partner", new PartnershipModel());
        return "partnerPage";
    }

    @PostMapping("/save")
    public String savePartner(@ModelAttribute("partner") PartnershipModel partner) {
        partnershipService.savePartner(partner);
        return "redirect:/partner"; // Poprawiona ścieżka przekierowania
    }

    @GetMapping("/database")
    public String listPartnership(Model model) {
        model.addAttribute("partners", partnershipService.getAllPartner());
        return "databasePage";
    }

}
