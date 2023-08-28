package pl.thermo.thermo.services;
import org.springframework.stereotype.Service;
import pl.thermo.thermo.models.UserModel;


import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<UserModel> users;

    public UserService() {
        users = new ArrayList<>();
        UserModel admin = new UserModel();
        admin.setUsername("admin");
        admin.setPassword("admin123");
        users.add(admin);
    }

    public UserModel getUserByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
