package pl.thermo.thermo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.thermo.thermo.models.ClientModel;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
