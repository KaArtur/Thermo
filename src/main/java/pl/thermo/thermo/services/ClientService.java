package pl.thermo.thermo.services;


import org.springframework.stereotype.Service;
import pl.thermo.thermo.models.ClientModel;
import pl.thermo.thermo.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClient() {
        return clientRepository.findAll();
    }

    public void saveClient(ClientModel clientModel) {
        clientRepository.save(clientModel);
    }

    public void deleteAllClients() {
        clientRepository.deleteAll();
    }

    public void deleteClientById(Long clientId) {
        clientRepository.deleteById(clientId);
    }
}
