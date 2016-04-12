package org.ndt.ecrop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="insurance")
public class Insurance 
{
	
	@Id
	 @GeneratedValue
	@Column(name="insurId")
	private int insurId;
	
	@Column(name="policynum")
	private String policynum;
	
	@Column(name="premiumCost")
	private String premiumCost;
	
	@Column(name="duration")
	private String duration;

	public int getInsurId() {
		return insurId;
	}

	public void setInsurId(int insurId) {
		this.insurId = insurId;
	}

	public String getPolicynum() {
		return policynum;
	}

	public void setPolicynum(String policynum) {
		this.policynum = policynum;
	}

	public String getPremiumCost() {
		return premiumCost;
	}

	public void setPremiumCost(String premiumCost) {
		this.premiumCost = premiumCost;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Insurance() {
		// TODO Auto-generated constructor stub
	}
	public Insurance(int insurId, String policynum, String premiumCost,
			String duration) {
		super();
		this.insurId = insurId;
		this.policynum = policynum;
		this.premiumCost = premiumCost;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Insurance [insurId=" + insurId + ", policynum=" + policynum
				+ ", premiumCost=" + premiumCost + ", duration=" + duration
				+ "]";
	}
	
	

}
