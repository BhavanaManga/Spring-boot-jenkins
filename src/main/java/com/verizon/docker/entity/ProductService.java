package com.verizon.docker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductService {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	 private String prouctName;
	 private String description;
	 private Integer price;
	 
	 public ProductService() {
		 
	 }

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProuctName() {
		return prouctName;
	}

	public void setProuctName(String prouctName) {
		this.prouctName = prouctName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductService [productId=" + productId + ", prouctName=" + prouctName + ", description=" + description
				+ ", price=" + price + "]";
	}

	public ProductService(Integer productId, String prouctName, String description, Integer price) {
		super();
		this.productId = productId;
		this.prouctName = prouctName;
		this.description = description;
		this.price = price;
	}
	 
	 

}
