package br.com.correios.model;

public enum Status {
	NEED_SETUP,	// Precisa baixar o CSV dos correios
	SETUP_RUNNING,	// Está baixando/salvando no banco
	READY;	// Serviço está apto para ser consumido
}
