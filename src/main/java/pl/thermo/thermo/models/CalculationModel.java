package pl.thermo.thermo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CalculationModel {


    @Id
    @GeneratedValue
    private Long id;

    private CalculationYearEnum calculationYearEnum;

    private Double area;

    private Double result;

    public CalculationModel(Long id, CalculationYearEnum calculationYearEnum, Double area, Double result) {
        this.id = id;
        this.calculationYearEnum = calculationYearEnum;
        this.area = area;
        this.result = result;
    }

    public CalculationModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CalculationYearEnum getCalculationYearEnum() {
        return calculationYearEnum;
    }

    public void setCalculationYearEnum(CalculationYearEnum calculationYearEnum) {
        this.calculationYearEnum = calculationYearEnum;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
