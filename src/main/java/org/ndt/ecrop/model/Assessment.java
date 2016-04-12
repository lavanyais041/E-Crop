package org.ndt.ecrop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="assessment")
public class Assessment 
{
    @Id
    @GeneratedValue
    @Column(name="assId")
	private int assId;
    
    @Column(name="cultivator")
    private String cultivator;
    
    @Column(name="area")
    private String area;
    
    @OneToMany(cascade=CascadeType.ALL)
    @Column(name="crop")
    private Crop crop;
    
    @OneToMany(cascade=CascadeType.ALL)
    @Column(name="fertilizer")
    private Fertilizer fertilizer;
    
    @OneToMany(cascade=CascadeType.ALL)
    @Column(name="pesticide")
    private Pesticide pesticide;
    
    @OneToOne(cascade=CascadeType.ALL)
    @Column(name="insurance")
    private Insurance insurance;
    
    @ManyToOne
    @Column(name="survey")
    private Survey survey;
    
    @Column(name="preticted_yield")
    private String preticted_yield;
    
    @Column(name="actualYield")
    private String actualYield;
    
    @Column(name="longitude")
    private String longitude;
    
    @Column(name=" latitude")
    private String latitude;
    
    @Column(name="startDate")
    private String startDate;
    
    @Column(name="endDate")
    private String endDate;

	public int getAssId() {
		return assId;
	}

	public void setAssId(int assId) {
		this.assId = assId;
	}

	public String getCultivator() {
		return cultivator;
	}

	public void setCultivator(String cultivator) {
		this.cultivator = cultivator;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Crop getCrop() {
		return crop;
	}

	public void setCrop(Crop crop) {
		this.crop = crop;
	}

	public Fertilizer getFertilizer() {
		return fertilizer;
	}

	public void setFertilizer(Fertilizer fertilizer) {
		this.fertilizer = fertilizer;
	}

	public Pesticide getPesticide() {
		return pesticide;
	}

	public void setPesticide(Pesticide pesticide) {
		this.pesticide = pesticide;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public String getPreticted_yield() {
		return preticted_yield;
	}

	public void setPreticted_yield(String preticted_yield) {
		this.preticted_yield = preticted_yield;
	}

	public String getActualYield() {
		return actualYield;
	}

	public void setActualYield(String actualYield) {
		this.actualYield = actualYield;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
    
public Assessment() {
	// TODO Auto-generated constructor stub
}

public Assessment(int assId, String cultivator, String area, Crop crop,
		Fertilizer fertilizer, Pesticide pesticide, Insurance insurance,
		Survey survey, String preticted_yield, String actualYield,
		String longitude, String latitude, String startDate, String endDate) {
	super();
	this.assId = assId;
	this.cultivator = cultivator;
	this.area = area;
	this.crop = crop;
	this.fertilizer = fertilizer;
	this.pesticide = pesticide;
	this.insurance = insurance;
	this.survey = survey;
	this.preticted_yield = preticted_yield;
	this.actualYield = actualYield;
	this.longitude = longitude;
	this.latitude = latitude;
	this.startDate = startDate;
	this.endDate = endDate;
}

@Override
public String toString() {
	return "Assessment [assId=" + assId + ", cultivator=" + cultivator
			+ ", area=" + area + ", crop=" + crop + ", fertilizer="
			+ fertilizer + ", pesticide=" + pesticide + ", insurance="
			+ insurance + ", survey=" + survey + ", preticted_yield="
			+ preticted_yield + ", actualYield=" + actualYield + ", longitude="
			+ longitude + ", latitude=" + latitude + ", startDate=" + startDate
			+ ", endDate=" + endDate + "]";
}


	
}
