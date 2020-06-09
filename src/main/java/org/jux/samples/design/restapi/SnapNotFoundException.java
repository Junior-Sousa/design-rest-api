package org.jux.samples.design.restapi;

public class SnapNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1053011280531762547L;

	public SnapNotFoundException(Long id) {
		super("Could not find snap " + id);
	}
}
