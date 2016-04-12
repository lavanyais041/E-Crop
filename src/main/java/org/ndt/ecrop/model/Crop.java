package org.ndt.ecrop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crop")
public class Crop 
{

	 @Id
	 @GeneratedValue
	 @Column(name="cropId")
	 private int cropId;
	 
	 @Column(name="cropBreed")
	 private String cropBreed;
	 
	 @Column(name="cropSupplier")
	 private String cropSupplier;
	 
	 @Column(name="cropQuantity")
	 private String cropQuantity;
	 
	 @Column(name="cropCost")
	 private String cropCost;

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getCropBreed() {
		return cropBreed;
	}

	public void setCropBreed(String cropBreed) {
		this.cropBreed = cropBreed;
	}

	public String getCropSupplier() {
		return cropSupplier;
	}

	public void setCropSupplier(String cropSupplier) {
		this.cropSupplier = cropSupplier;
	}

	public String getCropQuantity() {
		return cropQuantity;
	}

	public void setCropQuantity(String cropQuantity) {
		this.cropQuantity = cropQuantity;
	}

	public String getCropCost() {
		return cropCost;
	}

	public void setCropCost(String cropCost) {
		this.cropCost = cropCost;
	}
	 
	 public Crop() {
		// TODO Auto-generated constructor stub
	}

	public Crop(int cropId, String cropBreed, String cropSupplier,
			String cropQuantity, String cropCost) {
		super();
		this.cropId = cropId;
		this.cropBreed = cropBreed;
		this.cropSupplier = cropSupplier;
		this.cropQuantity = cropQuantity;
		this.cropCost = cropCost;
	}

	@Override
	public String toString() {
		return "Crop [cropId=" + cropId + ", cropBreed=" + cropBreed
				+ ", cropSupplier=" + cropSupplier + ", cropQuantity="
				+ cropQuantity + ", cropCost=" + cropCost + "]";
	}
	 
	 
	 
	
	
}
