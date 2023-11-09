package com.mvc.control;

// XXXAction의 비즈니스 로직 수행 후 컨트롤러에게 반환하는 객체

public class ActionForward {
	private String url;
	private boolean redirect;

	public ActionForward() {}

	public ActionForward(String url) {
		this.url = url;
	}

	public ActionForward(String url, boolean redirect) {
		this.url = url;
		this.redirect = redirect;
	}

	public String getUrl() {
		return url;
	}

	public boolean isRedirect() {
		return redirect;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	
	
}
