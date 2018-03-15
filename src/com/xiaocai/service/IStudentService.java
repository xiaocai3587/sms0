package com.xiaocai.service;

import com.xiaocai.beans.Student;

public interface IStudentService {

	

	Student checkStudent(String num, String password);
	//向DB中添加student
	Integer saveStudent(Student student);


}
