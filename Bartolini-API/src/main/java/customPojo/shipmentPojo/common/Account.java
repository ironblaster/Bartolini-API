package customPojo.shipmentPojo.common;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;

public class Account implements Serializable{

	
	@NotEmpty
	String userID;
	@NotEmpty
	String password;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return String.format("Account [userID=%s, password=%s]", userID, password);
	}
	
	
	
}
