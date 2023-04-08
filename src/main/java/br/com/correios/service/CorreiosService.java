package br.com.correios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.correios.exception.NoContentException;
import br.com.correios.exception.NotReadyException;
import br.com.correios.model.Address;
import br.com.correios.model.AddressStatus;
import br.com.correios.model.Status;
import br.com.correios.repository.AddressRepository;
import br.com.correios.repository.AddressStatusRepository;

@Service
public class CorreiosService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AddressStatusRepository addressStatusRepository;

	public Status getStatus() {
		return this.addressStatusRepository.findById(AddressStatus.DEFAULT_ID)
				.orElse(new AddressStatus(Status.NEED_SETUP))
				.getStatus();
	}
	
	public Address getAddressByZipcode(String zipcode) throws NoContentException, NotReadyException{
		if(!this.getStatus().equals(Status.READY))
				throw new NotReadyException();
			
		return addressRepository.findById(zipcode)
				.orElseThrow(NoContentException::new);
	}
	
	public void setup() {
		
	}
	
}
