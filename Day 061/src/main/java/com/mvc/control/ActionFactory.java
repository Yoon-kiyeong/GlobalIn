package com.mvc.control;

import com.mvc.action.Action;

// 사용자의 요청을 처리할 비즈니스 로직이 구현된 XXXAction 객체의 생성을 담당함

public class ActionFactory {
	private static ActionFactory factory;

	private ActionFactory() {}

	public static synchronized ActionFactory getInstance() {
		if (factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}

	public Action getAction(String cmd) {
		Action action = null;
		if (cmd.equals("index")) {
			action = new IndexAction();
		}
		return action;
	}
}
