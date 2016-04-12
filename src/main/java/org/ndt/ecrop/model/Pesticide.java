package org.ndt.ecrop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pesticide")
public class Pesticide 
{

	@Id
	 @GeneratedValue
	@Column(name="pestId")
	private int pestId;
	
	@Column(name="pestName")
	private String pestName;
	

	@Column(name="pestQuaty")
	private String pestQuaty;
	
	@Column(name="pestCost")
	private String pestCost;

	public int getPestId() {
		return pestId;
	}

	public void setPestId(int pestId) {
		this.pestId = pestId;
	}

	public String getPestName() {
		return pestName;
	}

	public void setPestName(String pestName) {
		this.pestName = pestName;
	}

	public String getPestQuaty() {
		return pestQuaty;
	}

	public void setPestQuaty(String pestQuaty) {
		this.pestQuaty = pestQuaty;
	}

	public String getPestCost() {
		return pestCost;
	}

	public void setPestCost(String pestCost) {
		this.pestCost = pestCost;
	}
	
	public Pesticide() {
		// TODO Auto-generated constructor stub
	}

	public Pesticide(int pestId, String pestName, String pestQuaty,
			String pestCost) {
		super();
		this.pestId = pestId;
		this.pestName = pestName;
		this.pestQuaty = pestQuaty;
		this.pestCost = pestCost;
	}

	@Override
	public String toString() {
		return "Pesticide [pestId=" + pestId + ", pestName=" + pestName
				+ ", pestQuaty=" + pestQuaty + ", pestCost=" + pestCost + "]";
	}
	
	
	
}
