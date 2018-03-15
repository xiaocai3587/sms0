package com.xiaocai.dao;

import com.xiaocai.beans.Student;

public interface IStudentDao {

	Student selectStudentLogin(String num, String password);

	Integer insertStudent(Student student);

}
