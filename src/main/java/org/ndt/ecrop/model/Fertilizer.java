package org.ndt.ecrop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fertilizer")
public class Fertilizer 
{

	@Id
	 @GeneratedValue
	@Column(name="ferId")
	private int ferId;
	
	@Column(name="ferName")
	private String ferName;
	
	@Column(name="ferQuaty")
	private String ferQuaty;
	
	@Column(name="ferCost")
	private String ferCost;

	public int getFerId() {
		return ferId;
	}

	public void setFerId(int ferId) {
		this.ferId = ferId;
	}

	public String getFerName() {
		return ferName;
	}

	public void setFerName(String ferName) {
		this.ferName = ferName;
	}

	public String getFerQuaty() {
		return ferQuaty;
	}

	public void setFerQuaty(String ferQuaty) {
		this.ferQuaty = ferQuaty;
	}

	public String getFerCost() {
		return ferCost;
	}

	public void setFerCost(String ferCost) {
		this.ferCost = ferCost;
	}
	
	public Fertilizer() {
		// TODO Auto-generated constructor stub
	}

	public Fertilizer(int ferId, String ferName, String ferQuaty, String ferCost) {
		super();
		this.ferId = ferId;
		this.ferName = ferName;
		this.ferQuaty = ferQuaty;
		this.ferCost = ferCost;
	}

	@Override
	public String toString() {
		return "Fertilizer [ferId=" + ferId + ", ferName=" + ferName
				+ ", ferQuaty=" + ferQuaty + ", ferCost=" + ferCost + "]";
	}
	
	
	
	
}
