package pl.thermo.thermo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PartnerController {


    @GetMapping("/partner")
    public String partnerPage(){
        return "partnerPage";
    }

}
