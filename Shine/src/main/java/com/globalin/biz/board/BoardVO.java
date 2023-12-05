package com.globalin.biz.board;

import java.util.Date;

public class BoardVO {
	private int no;
	private String title;
	private String content;
	private String name;
	private String deptName;
	private int count;
	private byte files;
	private Date regDate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public byte getFiles() {
		return files;
	}
	public void setFiles(byte files) {
		this.files = files;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "BoardVO [no = " + no + ", title = " + title + ", content = " + content + ", name = " + name + ", deptname = " + deptName + ", count = " + count + ", files = " + files + ", regdate = " + regDate; 
	}
}
