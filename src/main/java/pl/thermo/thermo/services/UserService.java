package pl.thermo.thermo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.thermo.thermo.models.UserModel;
import pl.thermo.thermo.repositories.UserRepository;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel registerUser(String username, String password) {
        UserModel newUser = new UserModel();
        newUser.setUsername(username);
        newUser.setPassword(password);

        return userRepository.save(newUser);
    }


}
