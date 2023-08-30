package pl.thermo.thermo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class ClientModel {

    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 1, max = 40)
    private String clientName;


    @Size(min = 9, max = 9)
    private String phoneNumber;

    private List<IndustryEnum> industryEnumClient;

    private RegionEnum regionEnumClient;

    public ClientModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<IndustryEnum> getIndustryEnumClient() {
        return industryEnumClient;
    }

    public void setIndustryEnumClient(List<IndustryEnum> industryEnumClient) {
        this.industryEnumClient = industryEnumClient;
    }

    public RegionEnum getRegionEnumClient() {
        return regionEnumClient;
    }

    public void setRegionEnumClient(RegionEnum regionEnumClient) {
        this.regionEnumClient = regionEnumClient;
    }
}
