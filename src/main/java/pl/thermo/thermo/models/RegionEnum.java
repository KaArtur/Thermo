package pl.thermo.thermo.models;

public enum RegionEnum {


        DOLNOSLASKIE("Dolnośląskie"),
        KUJAWSKO_POMORSKIE("Kujawsko-Pomorskie"),
        LUBELSKIE("Lubelskie"),
        LUBUSKIE("Lubuskie"),
        LODZKIE("Łódzkie"),
        MALOPOLSKIE("Małopolskie"),
        MAZOWIECKIE("Mazowieckie"),
        OPOLSKIE("Opolskie"),
        PODKARPACKIE("Podkarpackie"),
        PODLASKIE("Podlaskie"),
        POMORSKIE("Pomorskie"),
        SLASKIE("Śląskie"),
        SWIETOKRZYSKIE("Świętokrzyskie"),
        WARMIŃSKO_MAZURSKIE("Warmińsko-Mazurskie"),
        WIELKOPOLSKIE("Wielkopolskie"),
        ZACHODNIOPOMORSKIE("Zachodniopomorskie");

        private final String displayName;

        RegionEnum(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }

}
