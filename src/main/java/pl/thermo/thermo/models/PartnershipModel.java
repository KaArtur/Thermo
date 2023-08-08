package pl.thermo.thermo.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class PartnershipModel {

    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 1, max = 40)
    private String businessName;

    @Size(min = 2, max = 40)
    private String street;

    @Size(min = 6, max = 6)
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}")
    private String postalCode;

    @Size(min = 2, max = 30)
    private String city;

    @Pattern(regexp = "\\d{10}")
    private String NIP ;

    public String getBusinessName() {
        return businessName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public PartnershipModel(Long id, String businessName, String street, String postalCode, String city, String NIP) {
        this.id = id;
        this.businessName = businessName;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.NIP = NIP;
    }
}
