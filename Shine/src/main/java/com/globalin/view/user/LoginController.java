package com.globalin.view.user;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.globalin.biz.user.UserVO;
import com.globalin.biz.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login.do", method=RequestMethod.GET)
	public String loginView(@ModelAttribute("user")UserVO vo) {
		System.out.println("로그인 페이지로 이동");
		vo.setId("test");
		vo.setPw("test1234");
		return "main.jsp";
	}
	
	
	@RequestMapping(value = "/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO dao, HttpSession session) {
		
		UserVO user = dao.getUser(vo);
		if(user != null) {
			//session.setAttribute("userName",user.getName());
			return "main.jsp";
		} else {
			return "index.jsp";
		}
	}
}