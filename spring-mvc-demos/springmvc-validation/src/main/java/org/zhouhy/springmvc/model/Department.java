package org.zhouhy.springmvc.model;

public class Department {
	private Integer id;
	private String dptName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dptName=" + dptName + "]";
	}	
}
