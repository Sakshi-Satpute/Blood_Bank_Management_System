package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stock")
@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@Setter
public class BloodStock extends BaseEntity{
	@OneToOne
    //@MapsId
    @JoinColumn(name = "bank_id")
    private BloodBank bank;
	private int aPositive;
	private int bPositive;
	private int abPositive;
	private int oPositive;
	private int aNegative;
	private int bNegative ;
	private int abNegative;
	private int oNegative;
	
	
	public BloodStock() {
		super();
	}
	public BloodStock(BloodBank bank, int aPositive, int bPositive, int abPositive, int oPositive, int aNegative,
			int bNegative, int abNegative, int oNegative) {
		super();
		this.bank = bank;
		this.aPositive = aPositive;
		this.bPositive = bPositive;
		this.abPositive = abPositive;
		this.oPositive = oPositive;
		this.aNegative = aNegative;
		this.bNegative = bNegative;
		this.abNegative = abNegative;
		this.oNegative = oNegative;
		
		
	}
	public BloodBank getBank() {
		return bank;
	}
	public void setBank(BloodBank bank) {
		this.bank = bank;
	}
	public int getaPositive() {
		return aPositive;
	}
	public void setaPositive(int aPositive) {
		this.aPositive = aPositive;
	}
	public int getbPositive() {
		return bPositive;
	}
	public void setbPositive(int bPositive) {
		this.bPositive = bPositive;
	}
	public int getAbPositive() {
		return abPositive;
	}
	public void setAbPositive(int abPositive) {
		this.abPositive = abPositive;
	}
	public int getoPositive() {
		return oPositive;
	}
	public void setoPositive(int oPositive) {
		this.oPositive = oPositive;
	}
	public int getaNegative() {
		return aNegative;
	}
	public void setaNegative(int aNegative) {
		this.aNegative = aNegative;
	}
	public int getbNegative() {
		return bNegative;
	}
	public void setbNegative(int bNegative) {
		this.bNegative = bNegative;
	}
	public int getAbNegative() {
		return abNegative;
	}
	public void setAbNegative(int abNegative) {
		this.abNegative = abNegative;
	}
	public int getoNegative() {
		return oNegative;
	}
	public void setoNegative(int oNegative) {
		this.oNegative = oNegative;
	}
	
	
	
	
	
	

}
