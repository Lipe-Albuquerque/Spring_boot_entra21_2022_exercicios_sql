package br.com.entra21.exercicios.sql.exercicios.services.exception;

public class DataIntregatyViolationException extends Exception {

	public DataIntregatyViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataIntregatyViolationException(String message) {
		super(message);
	}

	
}
