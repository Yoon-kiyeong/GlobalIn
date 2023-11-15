package com.mvcmem.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcmem.control.ActionForward;

// 로그인 화면 액션과 이동할 페이지 지정
public class LoginFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		return new ActionForward("/mvcmem/login.jsp", false);
	}

}
