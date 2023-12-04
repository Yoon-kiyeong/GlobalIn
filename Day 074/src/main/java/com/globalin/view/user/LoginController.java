package com.globalin.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.globalin.biz.user.UserVO;
import com.globalin.biz.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO dao) {
		if(dao.getUser(vo)!= null) {
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}
	}
}