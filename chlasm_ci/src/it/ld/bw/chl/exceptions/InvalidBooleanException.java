package it.ld.bw.chl.exceptions;

public class InvalidBooleanException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private final int code;
	
	public InvalidBooleanException(int code) {
		super("Invalid boolean value: " + code);
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}
