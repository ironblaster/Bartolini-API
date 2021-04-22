package customPojo.shipmentPojo.common;

import java.io.Serializable;

public class Account implements Serializable{

	
	
	String userID;
	
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
