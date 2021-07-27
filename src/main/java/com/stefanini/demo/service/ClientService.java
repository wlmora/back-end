package com.stefanini.demo.service;

import com.stefanini.demo.model.Client;
import com.stefanini.demo.repository.IClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService {

    //Clients repository
    private final IClientRepository clientRepository;

    /**
     * Get all clients
     * @return list clients
     */
    public List<Client> clients(){
        return clientRepository.findAll();
    }

    /**
     * Create new client
     * @param client
     * @return client
     */
    public Client createClient(Client client){
        return clientRepository.save(client);
    }
}
