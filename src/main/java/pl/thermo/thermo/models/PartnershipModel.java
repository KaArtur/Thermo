package pl.thermo.thermo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
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

   // @Pattern(regexp = "\\d{10}")
    private String NIP ;

    @Size(min = 2, max = 30)
    private String mail;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }



    public PartnershipModel() {
    }
}

