package com.globalin.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.globalin.biz.user.UserService;
import com.globalin.biz.user.UserVO;

public class UserServiceClient {
	public static void main(String[] args) {

		// 1. Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 요청함
		UserService userService = (UserService) container.getBean("userService");

		// 3. 로그인 기능 테스트
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPw("test1234");

		UserVO employee = userService.getUser(vo);

		if (employee != null) {
			System.out.println(employee.getName() + "님 환영합니다");
		} else {
			System.out.println("로그인 실패");
		}
		container.close();
	}
}
