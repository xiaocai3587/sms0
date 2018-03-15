package com.xiaocai.servlet;

import com.xiaocai.beans.Student;
import com.xiaocai.dao.IStudentDao;
import com.xiaocai.service.IStudentService;
import com.xiaocai.service.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao ;
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public Student checkStudent(String num, String password) {
		return dao.selectStudentLogin(num,password) ;
	}

	@Override
	public Integer saveStudent(Student student) {
		return dao.insertStudent(student);
	}



}
