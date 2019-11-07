package myprojects.angriff.service.hibbean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class LoginHIBBean {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long loginId;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LASTNAME")
	private String lastname;
	@Column(name = "ROLE")
	private String role ="US";
	
	public LoginHIBBean() {
		
	}
	
	public LoginHIBBean(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public LoginHIBBean(String username, String password, String email, String name, String lastname) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.lastname = lastname;
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
