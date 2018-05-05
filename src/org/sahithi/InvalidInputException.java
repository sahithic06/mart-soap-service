package org.sahithi;

public class InvalidInputException extends Exception {

	private String errorDetail;
	
	public InvalidInputException(String reason, String errorDetails) {
		
		super(reason);
		this.errorDetail = errorDetail;
		
	}
	
	public String getFaultInfo() {
		
		return errorDetail;
	}
	
}
