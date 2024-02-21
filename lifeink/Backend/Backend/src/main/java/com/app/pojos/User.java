package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="user")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class User {
	
	
	@Id
	private int Id;
	@Column(length = 30)
	private String email;
	
	@Column(length = 15, nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 15, nullable = false)
	private UserRole role;

	public User() {
		super();
	}

	public User(String email, String password, UserRole role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
	
	
}
