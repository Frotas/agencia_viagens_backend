package br.com.voetuor.server.repository;

import br.com.voetuor.server.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepository extends CrudRepository<Address, String> { }
