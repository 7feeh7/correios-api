package br.com.correios.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressStatus {
	public static final int DEFAULT_ID = 1;
	
	@Id
	private int id;
	private Status status;
	
	public AddressStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AddressStatus(int id, Status status) {
		super();
		this.id = id;
		this.status = status;
	}
	
	public AddressStatus(Status status) {
		super();
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
