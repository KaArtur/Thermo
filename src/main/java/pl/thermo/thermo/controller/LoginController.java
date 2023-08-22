package pl.thermo.thermo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }

    @GetMapping("/home")
    public String startPage(){
        return "homePage";
    }


}
