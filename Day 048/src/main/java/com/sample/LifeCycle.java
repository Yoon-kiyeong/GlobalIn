package com.sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/LifeCycle")
//@WebServlet(name = "LifeServlet", urlPatterns = { "/LifeServlet", "/A", "/B" })
@WebServlet(name = "LifeServlet", value = { "/LifeServlet", "/A", "/B" })
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 생성자
	public LifeCycle() {
		System.out.println("LifeServlet의 생성자 메소드 호출");
	}

	// Servlet 초기화 작업을 담당
	// Servlet 객체 생성시 단 한번만 수행됨5
	public void init() throws ServletException {
		System.out.println("LifeServlet의 init 메소드 호출");
	}

	// Servlet 객체가 WAS에서 소멸될 때 수행됨
	public void destroy() {
		System.out.println("LifeServlet의 destroy 메소드 호출");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("LifeServlet의 service 메소드 호출");
	}
}
