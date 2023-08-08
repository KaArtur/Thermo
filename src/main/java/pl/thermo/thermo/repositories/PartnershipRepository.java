package pl.thermo.thermo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.thermo.thermo.models.PartnershipModel;

public interface PartnershipRepository extends JpaRepository<PartnershipModel, Long> {
}
