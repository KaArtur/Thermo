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

    private Double resultCO;
    private Double resultCWU;
    private Double resultSum;
    private Double people;
    private Double expenditure;




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

    public Double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Double expenditure) {
        this.expenditure = expenditure;
    }

    public Double getPeople() {
        return people;
    }

    public void setPeople(Double people) {
        this.people = people;
    }

    public Double getResultCWU() {
        return resultCWU;
    }

    public void setResultCWU(Double resultCWU) {
        this.resultCWU = resultCWU;
    }

    public Double getResultSum() {
        return resultSum;
    }

    public void setResultSum(Double resultSum) {
        this.resultSum = resultSum;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getResultCO() {
        return resultCO;
    }

    public void setResultCO(Double result) {
        this.resultCO = result;
    }
}
