package com.cap.caphbmsspringboot.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String username;
	String email;
	String password;
	String role;
	String mobile;
	String address;
	
	public User() {
		
	}

	public User(String username, String email, String password, String role, String mobile, String address) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.address = address;
	}

	
	public int getid() {
		return id;
	}

	public void setUserid(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

//	public Optional<User> map(Object object) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	  @Override
//	  public boolean equals(Object o) {
//
//	    if (this == o)
//	      return true;
//	    if (!(o instanceof User))
//	      return false;
//	    User user = (User) o;
//	    return Objects.equals(this.id, user.id) && Objects.equals(this.username, user.username)
//	        && Objects.equals(this.email, user.email) && Objects.equals(this.mobile, user.mobile)&& Objects.equals(this.address, user.address);
//	  }
	
	
	public boolean map(Object o) {
		    if (this == o)
		      return true;
		    if (!(o instanceof User))
		      return false;
		    User user = (User) o;
		    return Objects.equals(this.id, user.id) && Objects.equals(this.username, user.username)
		    		&& Objects.equals(this.email, user.email) && Objects.equals(this.mobile, user.mobile)
		    		&& Objects.equals(this.address, user.address);
		  
	}
	  @Override
	  public int hashCode() {
	    return Objects.hash(this.id, this.username, this.email, this.mobile, this.address);
	  }
	  
	  @Override
		public String toString() {
			return "User [userid=" + id + ", username=" + username + ", email=" + email + ", password=" + password
					+ ", role=" + role + ", mobile=" + mobile + ", address=" + address + "]";
		}


//	public boolean isEmpty() {
//		if(this.username.equals(user.username))
//		return false;
//	}


}
