package pl.thermo.thermo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.thermo.thermo.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
