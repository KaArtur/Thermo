package pl.thermo.thermo.services;

import javassist.NotFoundException;
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

    public PartnershipModel getPartnershipById(Long id) throws NotFoundException {
        return partnershipRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Partner with id " + id + " not found"));
    }

    public void deletePartnerById(Long id) {
        partnershipRepository.deleteById(id);
    }
}
