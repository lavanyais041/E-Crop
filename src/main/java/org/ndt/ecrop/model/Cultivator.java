package org.ndt.ecrop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cultivator")
public class Cultivator 
{
	 @Id
	 @GeneratedValue
	 @Column(name="cultivatorId")
	 private int cultivatorId;
	 
	 @Column(name="fname")
	 private String fname;
	 
	 @Column(name="lname")
	 private String lname;
	 
	 @Column(name="addharrnum")
	 private String addharrnum;
	 
	 @Column(name="address")
	 private String address;

	 @Column(name="phonenum")
	 private String phonenum;

	public int getCultivatorId() {
		return cultivatorId;
	}

	public void setCultivatorId(int cultivatorId) {
		this.cultivatorId = cultivatorId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddharrnum() {
		return addharrnum;
	}

	public void setAddharrnum(String addharrnum) {
		this.addharrnum = addharrnum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	 
	 public Cultivator() {
		// TODO Auto-generated constructor stub
	}

	public Cultivator(int cultivatorId, String fname, String lname,
			String addharrnum, String address, String phonenum) {
		super();
		this.cultivatorId = cultivatorId;
		this.fname = fname;
		this.lname = lname;
		this.addharrnum = addharrnum;
		this.address = address;
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "Cultivator [cultivatorId=" + cultivatorId + ", fname=" + fname
				+ ", lname=" + lname + ", addharrnum=" + addharrnum
				+ ", address=" + address + ", phonenum=" + phonenum + "]";
	}
	

}
