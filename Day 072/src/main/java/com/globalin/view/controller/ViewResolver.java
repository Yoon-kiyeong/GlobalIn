package com.globalin.view.controller;

/*
 * ViewResolver
 * - Controller가 리턴한 view 이름에 접두사와 접미사를 결합하여 
 * 최종 실행될 view 경로와 파일명을 완성시키는 작업을 하는 클래스이다.
 * 
 */

public class ViewResolver {
	public String prefix; // 접두사 login
	public String suffix; // 접미사 jsp

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getView(String viewName) {
		return prefix + viewName + suffix; // 접두사 + View 이름 + 접미사
	}
}
