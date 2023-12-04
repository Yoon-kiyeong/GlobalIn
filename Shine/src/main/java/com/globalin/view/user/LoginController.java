package com.globalin.view.user;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.globalin.biz.employee.EmployeeVO;
import com.globalin.biz.employee.impl.EmployeeDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login.do", method=RequestMethod.GET)
	public String loginView(@ModelAttribute("user")EmployeeVO vo) {
		System.out.println("로그인 페이지로 이동");
		vo.setId("test");
		vo.setPw("test123");
		return "login.jsp";
	}
	
	
	@RequestMapping(value = "/login.do", method=RequestMethod.POST)
	public String login(EmployeeVO vo, EmployeeDAO dao, HttpSession session) {
		
		EmployeeVO user = dao.getUser(vo);
		if(dao.getUser(vo)!= null) {
			session.setAttribute("userName",user.getName());
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}
	}
}