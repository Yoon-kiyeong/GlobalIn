package com.mvcmem.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvcmem.control.ActionForward;
import com.mvcmem.model.StudentDAO;


public class ModifyProcAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentDAO dao = StudentDAO.getInstance();
		HttpSession session = request.getSession();
		String loginID = (String)session.getAttribute("loginID");
		
		
		return new ActionForward("/mvcmem/modifyProc.jsp", false);
	}

}
