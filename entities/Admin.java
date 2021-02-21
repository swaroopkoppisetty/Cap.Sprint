package hbms.entities;

import javax.persistence.*;

@Entity
@Table(name="ADMIN_TABLE")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int admin_id;
	String admin_name;
	String password;
	@Transient
	String confirmPassword;
	
	public Admin() {
		
	}

	public Admin(String admin_name, String password, String confirmPassword) {
		super();
		this.admin_name = admin_name;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
	
}
