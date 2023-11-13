package com.mvc.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.action.Action;

// 

public class IndexAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Index");
		return new ActionForward("index.jsp", false);
	}
		
}
