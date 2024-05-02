package br.com.test.work.services.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(Object id) {
		super("Não localizamos um usuário com a ID " + id);
	}

}
