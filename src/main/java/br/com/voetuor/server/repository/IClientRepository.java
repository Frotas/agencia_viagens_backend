package br.com.voetuor.server.repository;

import br.com.voetuor.server.model.Client;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IClientRepository extends CrudRepository<Client, String> { }
