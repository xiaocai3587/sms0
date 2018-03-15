package com.xiaocai.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xiaocai.beans.Student;
import com.xiaocai.service.IStudentService;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("qqqqqqqqqqqq");
		//1 接受请求参数
			String num = request.getParameter("num");
			String password = request.getParameter("password");
			HttpSession session = request.getSession();
			if(num == null || "".equals(num)) {
				session.setAttribute("message", "用户名输入有误");
				response.sendRedirect(request.getContextPath() + "/login.jsp");
				return;
			}
			if(password == null || "".equals(num)) {
				session.setAttribute("message", "密码输入有误");
				return;
			}
		//2 创建Service对象
		IStudentService service = new StudentServiceImpl();
		//3调用Service对象的checkStudent()方法
		Student student = service.checkStudent(num , password);
		
		//4验证不通过则跳转到登陆页面，让用户再次输入信息，并在页面给出提示
		if(student == null ) {
			session.setAttribute("message", "用户名或密码输入有误");
			response.sendRedirect(request.getContextPath() + "/login.jsp");			
			return ;
		}
		//5验证通过这跳转到系统主页index.jsp
		response.sendRedirect(request.getContextPath() +  "/index.jsp");
	}

}



















