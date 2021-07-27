package com.stefanini.demo.controller;

import com.stefanini.demo.dto.ClientDTO;
import com.stefanini.demo.model.Client;
import com.stefanini.demo.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@AllArgsConstructor
@RestController
@RequestMapping("api/v1")
public class ClientController {

    //Logic business service
    private final ClientService clientService;

    @GetMapping(value = "/clients")
    public ResponseEntity<List<Client>> clients() {
        return ResponseEntity.ok(clientService.clients());
    }

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client){
        return clientService.createClient(client);
    }
}
