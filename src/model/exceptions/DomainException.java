package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L; // Versão da classe serializable
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
