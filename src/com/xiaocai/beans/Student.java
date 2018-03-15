package com.xiaocai.beans;

public class Student {
	private String password;
	private String num;
	private String name;
	private Integer age;
	private Double score;
	private int id;
	
	public Student() {
		super();
	}
	

	public Student(String num, String name, Integer age, Double score) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.score = score;
		
	}

	public Double getScore() {
		return score;
	}
	
	public void setScore(Double score) {
		this.score = score;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", age=" + age + ", password=" + password + "]";
	}


	public void setId(int id) {
		this.id = id ;
	}



}
