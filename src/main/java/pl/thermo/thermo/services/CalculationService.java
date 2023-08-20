package pl.thermo.thermo.services;


import org.springframework.stereotype.Service;
import pl.thermo.thermo.models.CalculationModel;

@Service
public class CalculationService {



    public double calculateResult(CalculationModel calculationModel) {
        double result = calculationModel.getCalculationYearEnum().getValue() * calculationModel.getArea() / 1000;
        return result;
    }


}
