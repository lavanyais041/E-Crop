package org.ndt.ecrop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="survey")
public class Survey 
{

	 @Id
	 @GeneratedValue
	 @Column(name="surveyId")
	 private int surveyId;
	
	 @Column(name="surveyNumber")
	 private String surveyNumber;
	 
	 @Column(name="ownerName")
	 private String ownerName;
	 
	 @Column(name="soilColor")
	 private String soilColor;
	 
	 @Column(name="area")
	 private String area;

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyNumber() {
		return surveyNumber;
	}

	public void setSurveyNumber(String surveyNumber) {
		this.surveyNumber = surveyNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSoilColor() {
		return soilColor;
	}

	public void setSoilColor(String soilColor) {
		this.soilColor = soilColor;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	 public Survey() {
		// TODO Auto-generated constructor stub
	}

	public Survey(int surveyId, String surveyNumber, String ownerName,
			String soilColor, String area) {
		super();
		this.surveyId = surveyId;
		this.surveyNumber = surveyNumber;
		this.ownerName = ownerName;
		this.soilColor = soilColor;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", surveyNumber="
				+ surveyNumber + ", ownerName=" + ownerName + ", soilColor="
				+ soilColor + ", area=" + area + "]";
	}
	 
	 
	
}
