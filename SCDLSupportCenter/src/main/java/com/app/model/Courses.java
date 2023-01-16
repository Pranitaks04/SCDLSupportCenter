package com.app.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private String price;
	
	@OneToMany(targetEntity =Enquiry.class,cascade =CascadeType.ALL)
	@JoinColumn(columnDefinition = "courseId",referencedColumnName = "id")
	
	List<Enquiry> enquiry;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public List<Enquiry> getEnquiry() {
		return enquiry;
	}
	public void setEnquiry(List<Enquiry> enquiry) {
		this.enquiry = enquiry;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", enquiry=" + enquiry
				+ "]";
	}
	
	

}
