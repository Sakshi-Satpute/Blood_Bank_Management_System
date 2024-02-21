package com.app.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="state")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class State extends BaseEntity{
	@Id
	private int id;
	@Column(length = 30)
	private String name;
	public State() {
		super();
	}
	public State(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + "]";
	}



	
	
	
	 
	
//	@OneToMany(mappedBy = "state", fetch = FetchType.EAGER)
//   private List<District> districts;
	
////	public State(){
////		
////	}
////	public State(String name, List<District> districts) {
////	super();
////	this.name = name;
////		this.districts = districts;
////	}
////	public State(String name) {
////		super();
////		this.name = name;
////	}
////	
////	
////	public List<District> getDistricts() {
////		return districts;
////	}
//	
////	public void setDistricts(List<District> districts) {
////		this.districts = districts;
////	}
////
////	public String getName() {
////		return name;
////	}
////
////	public void setName(String name) {
////		this.name = name;
////	}

	
	
	
}
