package com.app.pojos;

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
@Table(name="blood_bank")
@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@Setter
public class BloodBank  {
	@Id
	private int Id;
	@Column(length = 30)
	private String email;
	
	@Column(length = 50,name="name", nullable = false)
	private String bankName ;
	
	@Column(length = 50, name="hospital", nullable = false)
	private String parentHospital;
	
	@Column(length = 15)
	private String shortName;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 15)
	private Category category;
	
	@Column(length = 15,   nullable = false, unique = true)
	private String licence;
	
	@Column(length = 15, name="person", nullable = false)
	private String personName;
	
	
	
	@Column(length = 15, unique = true)
	private String contact;
	

	@ManyToOne
	@JoinColumn(name="city_id", nullable = false)
	private City city;
	
	
	@Enumerated(EnumType.STRING)
	@Column(length = 5, nullable = false)
	private  ComponentFacility facility;
	
	private int beds;
	
	@Column(length = 30)
	private String	website;
	
	@Column(length = 15, nullable = false)
	private String password;
	
	@Column(length = 100, nullable = false)
	private String address;
	
	//@OneToOne(mappedBy = "blood_bank")
//	@OneToOne(mappedBy = "stock",cascade = CascadeType.ALL)
//    @JoinColumn
//	private BloodStock bloodStock;
//	@OneToOne(mappedBy = "stock")
//    @PrimaryKeyJoinColumn
//    private BloodStock bloodStock;
	@Enumerated(EnumType.STRING)
	@Column(length = 15, nullable = true)
	private ReqStatus status;

	public BloodBank() {
		super();
	}

	public BloodBank(String email, String bankName, String parentHospital, String shortName, Category category,
			String licence, String personName, String contact, City city, ComponentFacility facility, int beds,
			String website, String password, String address, ReqStatus status) {
		super();
		this.email = email;
		this.bankName = bankName;
		this.parentHospital = parentHospital;
		this.shortName = shortName;
		this.category = category;
		this.licence = licence;
		this.personName = personName;
		this.contact = contact;
		this.city = city;
		this.facility = facility;
		this.beds = beds;
		this.website = website;
		this.password = password;
		this.address = address;
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getParentHospital() {
		return parentHospital;
	}

	public void setParentHospital(String parentHospital) {
		this.parentHospital = parentHospital;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public ComponentFacility getFacility() {
		return facility;
	}

	public void setFacility(ComponentFacility facility) {
		this.facility = facility;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ReqStatus getStatus() {
		return status;
	}

	public void setStatus(ReqStatus status) {
		this.status = status;
	}
	
	
	

}
