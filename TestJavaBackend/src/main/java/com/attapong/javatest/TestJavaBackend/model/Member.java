package com.attapong.javatest.TestJavaBackend.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="REFSESSIONCODE")
	private String refSessionCode;
	
	@Column(name="MEMBERTYPE")
	private String memberType;
	
	@Column(name="SALARY")
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRefSessionCode() {
		return refSessionCode;
	}

	public void setRefSessionCode(String refSessionCode) {
		this.refSessionCode = refSessionCode;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", userName=" + username + ", passWord=" + password + ", address=" + address
				+ ", phone=" + phone + ", refSessionCode=" + refSessionCode + ", memberType=" + memberType + ", salary="
				+ salary + "]";
	}
	
}
