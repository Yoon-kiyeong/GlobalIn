package com.globalin.biz.user;

import java.util.Date;

public class UserVO {
	private int no;
	private String id;
	private String pw;
	private String name;
	private String position;
	private String phone;
	private String call;
	private String email;
	private String gender;
	private String birth;
	private String deptname;
	private int deptno;
	private Date hiredate;
	private Date exitdate;
	private String status;
	private byte[] photo;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Date getExitdate() {
		return exitdate;
	}

	public void setExitdate(Date exitdate) {
		this.exitdate = exitdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public byte[] getPhoto() {
		return photo;
	}
	
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "UserVO [no= " + no + ", ID = " + id + ", pw = " + name + ", position = " + phone + ", call = " + call + ",email = " + email + ", gender = " + gender + ", birth = " + birth + ", deptno = " + deptno + ", deptname = " + deptname + ", deptno = " + deptno + ", hiredate = " + hiredate + ", exitdate = " + exitdate + ", status = " + status + ", photo = " + photo;
	}
}
