package com.globalin.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.globalin.biz.employee.EmployeeService;
import com.globalin.biz.employee.EmployeeVO;

public class EmployeeServiceClient {
	public static void main(String[] args) {

		// 1. Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 요청함
		EmployeeService userService = (EmployeeService) container.getBean("userService");

		// 3. 로그인 기능 테스트
		EmployeeVO vo = new EmployeeVO();
		vo.setId("test");
		vo.setPw("test123");

//		EmployeeVO employee = EmployeeService.getEmployee(vo);
//
//		if (employee != null) {
//			System.out.println(employee.getName() + "님 환영합니다");
//		} else {
//			System.out.println("로그인 실패");
//		}
		container.close();
	}
}
