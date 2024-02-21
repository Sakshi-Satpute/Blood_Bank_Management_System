package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="donor")
@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@Setter
public class Donor  {
	  
	@Id
	private String id;
	@Column(length = 30)
	private String email;
	
	
	@Column(length = 15)
	private String firstName ;
	
	@Column(length = 15)
	private String lastName;
	
	private LocalDate birthDate;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 15)
	private Gender gender;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@Column(length = 15)
	private String mobile;
	
	@Column(length = 15)
	private String password;

	public Donor() {
		super();
	}

	public Donor(String id,String email, String firstName, String lastName, LocalDate birthDate, Gender gender, City city,
			String mobile, String password) {
		super();
		this.id=id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.city = city;
		this.mobile = mobile;
		this.password = password;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Donor [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", gender=" + gender + ", city=" + city + ", mobile=" + mobile + ", password=" + password
				+ "]";
	}
	
	

}
