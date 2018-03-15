package com.xiaocai.servlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xiaocai.beans.Student;
import com.xiaocai.service.IStudentService;

public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 获取表单参数
		
		request.setCharacterEncoding("UTF-8");
			
		String num = request.getParameter("num");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String agestr = request.getParameter("age");
		String scorestr = request.getParameter("score");
		
		Integer age = Integer.valueOf(agestr);
		Double 	 score = Double.valueOf(scorestr);
		HttpSession session = request.getSession();
		if(num == null || "".equals(num)) {
			session.setAttribute("numMessage", "学号输入有误");
			response.sendRedirect(request.getContextPath() + "\register.jsp");
		}
		if(password == null || "".equals(password)) {
			session.setAttribute("passwordMessage", "密码输入有误");
			response.sendRedirect(request.getContextPath() + "\register.jsp");
		}
		if(name == null || "".equals(name)) {
			session.setAttribute("numMessage", "学号输入有误");
			response.sendRedirect(request.getContextPath() + "\register.jsp");
		}
		if(age == null || "".equals(age) || age> 100 || age < 0) {
			session.setAttribute("numMessage", "年龄输入有误");
			response.sendRedirect(request.getContextPath() + "\register.jsp");
		}
		if(score == null || "".equals(score) || score > 100 || score < 0) {
			session.setAttribute("numMessage", "分数输入有误");
			response.sendRedirect(request.getContextPath() + "\register.jsp");
		}
		//2 创建Student对象
		Student student = new Student(num,name,age,score);
		student.setPassword(password);
		//3 创建Service对象
		IStudentService service = new StudentServiceImpl();
		
		//4调用Service对象的saveStudent() 方法 将数据写入到 DB中
		Integer id = service.saveStudent(student);
		//5写入失败，则跳转到注册页面重新注册
		if(id == null) {
			response.sendRedirect(request.getContextPath() + "/register.jsp");
			return;
		}
		//6写入成功，则跳转到登陆页面
		response.sendRedirect(request.getContextPath() + "/login.jsp");
	}

}
