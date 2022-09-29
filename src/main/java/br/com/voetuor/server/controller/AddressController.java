package br.com.voetuor.server.controller;

import br.com.voetuor.server.model.Address;
import br.com.voetuor.server.repository.IAddressRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {

    private IAddressRepository repository;

    @PostMapping
    Address createAddress(@RequestBody Address data) { return repository.save(data); }

    @GetMapping
    void readAddress(@RequestBody @NotNull Address data) { repository.findById(data.getPk_cep()); }

    @PutMapping
    Address updateAddress(@RequestBody Address data) { return repository.save(data); }

    @DeleteMapping
    void deleteAddress(@RequestBody Address data) { repository.deleteById(data.getPk_cep()); }

}
