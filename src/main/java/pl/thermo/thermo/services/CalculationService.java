package pl.thermo.thermo.services;


import org.springframework.stereotype.Service;
import pl.thermo.thermo.models.CalculationModel;

@Service
public class CalculationService {



    public double calculateResultCO(CalculationModel calculationModel) {
        double result = calculationModel.getCalculationYearEnum().getValue() * calculationModel.getArea() / 1000;
        return Math.round(result * 100.0) / 100.0;
    }

    public double calculateResultCWU(CalculationModel calculationModel) {
        double exponent = -0.244;
        double var = 9.32 * (1.0 / Math.pow(calculationModel.getPeople(), -exponent));
        double result = (((calculationModel.getPeople() * (calculationModel.getExpenditure()/1000)) / 18 ) * 0.189 * var * 278) ;
        return Math.round(result * 100.0) / 100.0;
    }



}
