package com.model;

public class Member {

	
	private String id;
	private String pw;
	private String nName;
	private int age;
	private String regid;
	private String email;
	
	public Member(String id, String pw, String nName, int age, String regid, String email) {
		this.id =id;
		this.pw =pw;
		this.nName =nName;
		this.age = age;
		this.regid =regid;
		this.email =email;
		
	}
	public Member() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getnName() {
		return nName;
	}
	public void setnName(String nName) {
		this.nName = nName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmal(String email) {
		this.email = email;
	}
	
	
}
