package microservices.hrpayroll.entities;

import java.io.Serializable;

public class Error implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String error;

	public Error() {
		
	}
	
	public Error(String error) {
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
	

}
