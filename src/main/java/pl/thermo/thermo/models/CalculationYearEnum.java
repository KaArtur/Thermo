package pl.thermo.thermo.models;

public enum CalculationYearEnum {


    AFTER_2020("Po 2020", 40),
    BETWEEN_2015_AND_2020("2015-2020", 45),
    BETWEEN_2010_AND_2015("2010-2015", 50),
    BETWEEN_2005_AND_2010("2005-2010", 55),
    BETWEEN_2000_AND_2005("2000-2005", 60),
    BETWEEN_1990_AND_2000_PLUS_THERMO("1990-2000 + dodatkowo ocieplony 10cm styropianem", 65),
    BETWEEN_1990_AND_2000("1990-2000", 80),
    UNDER_1990_PLUS_THERMO("Poniżej 1990 + dodatkowo ocieplony 10cm styropianem", 70),
    UNDER_1990("Poniżej 1990", 100);

    private final String text;
    private final int value;

    CalculationYearEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public int getValue() {
        return value;
    }
}
