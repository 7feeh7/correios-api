package br.com.correios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.correios.exception.NoContentException;
import br.com.correios.exception.NotReadyException;
import br.com.correios.model.Address;
import br.com.correios.service.CorreiosService;

@RestController
public class CorreiosController {
	
	@Autowired
	private CorreiosService service;
	
	@GetMapping("/status")
	public String getStatus() {
		return "Service status: " + service.getStatus();
	}
	
	@GetMapping("/zipcode/{zipcode}")
	public Address getAddressByZipcode(@PathVariable("zipcode") String zipcode) throws NoContentException, NotReadyException{
		return this.service.getAddressByZipcode(zipcode);
	}

}
