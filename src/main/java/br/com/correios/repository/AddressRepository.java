package br.com.correios.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.correios.model.Address;

public interface AddressRepository extends CrudRepository<Address, String>{

}
