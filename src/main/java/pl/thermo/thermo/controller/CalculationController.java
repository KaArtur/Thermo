package pl.thermo.thermo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.thermo.thermo.models.CalculationModel;
import pl.thermo.thermo.services.CalculationService;

@Controller
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/calc")
    public String homeCalc(Model model) {
        model.addAttribute("calculationModel", new CalculationModel());
        return "calcPage";
    }


    @PostMapping("/calc")
    public String calculateResult(@ModelAttribute CalculationModel calculationModel, Model model) {
        double result = calculationService.calculateResultCO(calculationModel);
        double result2 = calculationService.calculateResultCWU(calculationModel);
        double result3 =result +result2 ;
        calculationModel.setResultCO(result);
        calculationModel.setResultCWU(result2);
        calculationModel.setResultSum(result3);
        model.addAttribute("calculationModel", calculationModel);
        return "calcPage";
    }



}
