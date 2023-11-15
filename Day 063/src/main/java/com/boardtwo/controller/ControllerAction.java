package com.boardtwo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.map.HashedMap;

import mvc.CommandProcess;

public class ControllerAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 명령어와 명령어 처리 클래스를 쌍으로 저장하는 앱
	private Map<String, Object> commandMap = new HashedMap<String, Object>();

	/*
	 * 명령어와 처리 클래스가 매핑되어 있는 properties 파일을 읽어서 Map 객체인 commandMap에 저장
	 * 
	 */

	@Override
	public void init(ServletConfig config) throws ServletException {

		// web.xml에서 propertyConfig에 해당하는 init-param의 값을 읽어와서 명령어와 처리 클래스의 매핑정보를 저장할
		// properties 객체를 생성함
		String props = config.getInitParameter("propertyConfig");

		Properties pr = new Properties();
		String path = config.getServletContext().getRealPath("/WEB-INF");

		FileInputStream f = null;
		try {
			f = new FileInputStream(new File(path, props));
			// Command.properties파일 정보를 properties 객체에 저장함
			pr.load(f);
		} catch (IOException e) {
			throw new ServletException(e);
		} finally {
			if (f != null)
				try {
					f.close();
				} catch (IOException e) {
				}
		}

		// 객체를 하나씩 꺼내서 그 객체명으로 Properties 객체에 저장된 객체에 접근함
		Iterator<Object> keyIter = pr.keySet().iterator();

		while (keyIter.hasNext()) {
			String command = (String) keyIter.next();
			String className = pr.getProperty(command);

			try {
				// 문자열을 클래스로 만듬
				Class commandClass = Class.forName(className);
				Object commandInstance = commandClass.newInstance();
				commandMap.put(command, commandInstance);
			} catch (ClassNotFoundException e) {
				throw new ServletException(e);
			} catch (InstantiationException e) {
				throw new ServletException(e);
			} catch (IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		requestPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		requestPro(request, response);
	}

	protected void requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String view = null;
		CommandProcess com = null;
		try {
			String command = request.getRequestURI();
			if (command.indexOf(request.getContextPath()) == 0) {
				command = command.substring(request.getContextPath().length());
			}
			com = (CommandProcess) commandMap.get(command);
			view = com.requestPro(request, response);
		} catch (Throwable e) {
			throw new ServletException(e);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
}
