package com.Practise.entities;

public class LoginData 
{
  @NotBlank(message = "User Name cn not be empty !!!!!!")
  @Size(min = 3, max = 1, message = "User name must be between 3-12 characters !!")
  private String userName;
  private String email;
 

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "LoginData [userName=" + userName + ", email=" + email + "]";
} 
}
