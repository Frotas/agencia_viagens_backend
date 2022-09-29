package br.com.voetuor.server.controller;

import br.com.voetuor.server.model.Client;
import br.com.voetuor.server.repository.IClientRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {

    private IClientRepository repository;

    @PostMapping
    Client createClient(@RequestBody Client data) {
        return repository.save(data);
    }

    @GetMapping
    void readClient(@RequestBody @NotNull Client data) {
        repository.findById(data.getPkClient().toString());
    }

    @PutMapping
    Client updateClient(@RequestBody Client data) {
        return repository.save(data);
    }

    @DeleteMapping
    void deleteClient(@RequestBody Client data) {
        repository.deleteById(data.getPkClient().toString());
    }

}
