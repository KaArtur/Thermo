package pl.thermo.thermo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.thermo.thermo.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
