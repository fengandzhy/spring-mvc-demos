package org.zhouhy.springmvc.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
	private Long Id;
	private String prodName;
	private BigDecimal prodPrice;
	private Date prodDate;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public BigDecimal getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(BigDecimal prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Date getProdDate() {
		return prodDate;
	}
	public void setProdDate(Date prodDate) {
		this.prodDate = prodDate;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodDate=" + prodDate
				+ "]";
	}	
}
