package com.boardone;

import java.sql.Timestamp;

public class BoardVO {
	private int num;
	private String writer;
	private String email;
	private String subject;
	private String pass;
	private int readcount;
	private int ref;
	private int step;
	private int depth;
	private Timestamp regdate;
	private String content;
	private String ip;
	
	public int getNum() {
		return num;
	}
	public String getWriter() {
		return writer;
	}
	public String getEmail() {
		return email;
	}
	public String getSubject() {
		return subject;
	}
	public String getPass() {
		return pass;
	}
	public int getReadcount() {
		return readcount;
	}
	public int getRef() {
		return ref;
	}
	public int getStep() {
		return step;
	}
	public int getDepth() {
		return depth;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public String getContent() {
		return content;
	}
	public String getIp() {
		return ip;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
