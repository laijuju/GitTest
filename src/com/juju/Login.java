package com.juju;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8925328035333075468L;
	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("收到请求："+name+"--"+password);
		Boolean bool = false;
		if(name.equals("juju") && password.equals("123123"))
		{
			bool = true;
		}
		if(bool){
			response.getWriter().write("登录成功");
		}else{
			response.getWriter().write("登录失败");
		}
	}
	
}
