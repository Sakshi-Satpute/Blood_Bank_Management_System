package com.app.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="district")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class District extends BaseEntity{
	@Id
	private int id;
	@Column(length = 50)
	private String name;
	
	@ManyToOne
   private State state;
	//State-->District: M-->1

	public District() {
		super();
	}
	public District(int id, String name, State state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
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
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", state=" + state + "]";
	}

	
	
}
