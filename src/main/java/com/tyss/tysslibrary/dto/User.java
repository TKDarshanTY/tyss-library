package com.tyss.tysslibrary.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@Column
	@GeneratedValue
	private int uId;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuAge() {
		return uAge;
	}
	public void setuAge(String uAge) {
		this.uAge = uAge;
	}
	public String getuMobileNo() {
		return uMobileNo;
	}
	public void setuMobileNo(String uMobileNo) {
		this.uMobileNo = uMobileNo;
	}
	public String getuSex() {
		return uSex;
	}
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	@OneToMany(cascade=CascadeType.ALL)
	private List<Book>book;
	@Column
	private String uName;
	@Column
	private String uEmail;
	@Column
	private String uPassword;
	@Column
	private String uAge;
	@Column
	private String uMobileNo;
	@Column
	private String uSex;
}
