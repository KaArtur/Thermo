package pl.thermo.thermo.services;

import org.springframework.stereotype.Service;
import pl.thermo.thermo.models.PartnershipModel;
import pl.thermo.thermo.repositories.PartnershipRepository;

import java.util.List;

@Service
public class PartnershipService {

    private final PartnershipRepository partnershipRepository;


    public PartnershipService(PartnershipRepository partnershipRepository) {
        this.partnershipRepository = partnershipRepository;
    }


    public List<PartnershipModel> getAllPartner(){
        return partnershipRepository.findAll();
    }

    public void savePartner(PartnershipModel partnershipModel) {
        partnershipRepository.save(partnershipModel);
    }

}
