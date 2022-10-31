package com.shipment.demo.ShipmentTracking.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FromAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dateMob;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "middle_name")
	private String middle_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "date")
	private Date date;

	@Column(name = "mobile_no")
	private int mobile_no;

	@Column(name = "description")
	private String description;

	@Column(name = "address_1")
	private String address_1;

	@Column(name = "address_2")
	private String address_2;

	@Column(name = "city")
	private String city;

	@Column(name = "zip_code")
	private int zip_code;

	public FromAddress(Integer dateMob, String first_name, String middle_name, String last_name, Date date,
			int mobile_no, String description, String address_1, String address_2, String city, int zip_code) {
		super();
		this.dateMob = dateMob;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.date = date;
		this.mobile_no = mobile_no;
		this.description = description;
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.city = city;
		this.zip_code = zip_code;
	}

	public FromAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDateMob() {
		return dateMob;
	}

	public void setDateMob(Integer dateMob) {
		this.dateMob = dateMob;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	@Override
	public String toString() {
		return "ShipmentAddress [dateMob=" + dateMob + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", date=" + date + ", mobile_no=" + mobile_no + ", description="
				+ description + ", address_1=" + address_1 + ", address_2=" + address_2 + ", city=" + city
				+ ", zip_code=" + zip_code + "]";
	}

}
