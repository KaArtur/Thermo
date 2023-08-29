package pl.thermo.thermo.models;

public enum IndustryEnum {

    CONSTRUCTION("Budowlana (docieplenia)"),
    INSTALLATION("Instalacje grzewcze i wentylacyjne"),
    HEATING_SYSTEM("Urządzenia grzewcze (kotły, pompy ciepła)"),
    WINDOW_DOOR_JOINERY("Stolarka okienna i drzwiowa");

    private final String text;


    IndustryEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
