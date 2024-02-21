package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="city")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class City extends BaseEntity{
	@Id
	private int id;
	
	@Column(length = 50)
	private String name;

	@ManyToOne
    private District district;

	public City() {
		super();
	}

	public City(int id, String name, District district) {
		super();
		this.id = id;
		this.name = name;
		this.district = district;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", district=" + district + "]";
	}
	

	
	
}
