package com.boardtwo.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

// 요청 파라미터로 명령어를 전달하는 방식의 인터페이스
public interface CommandAction {
	public String requestPro(HttpServlet request, HttpServletResponse response) throws Throwable;
}

