package JavaTraining;

import java.sql.Date;

public class User {
	private String userpassword;
	private String userName;
	private String userRole;
	private Date userCreatedOn;
	private boolean Isuseractive;
	private int userId;
	
	
	public boolean getIsuseractive() {
		return Isuseractive;
	}
	public boolean Isuseractive() {
		return Isuseractive;
	}
	public void setIsuseractive(boolean Isuseractive) {
		this.Isuseractive = Isuseractive;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Date getUserCreatedOn() {
		return userCreatedOn;
	}
	public void setUserCreatedOn(Date userCreatedOn) {
		this.userCreatedOn = userCreatedOn;
	}
	
	
	

}
