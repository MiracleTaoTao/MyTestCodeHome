package com.temt.bean;

/**
 * 学生类
 * @author TEMT
 *
 */
public class Student {
	
	public Student(){
		
	}
	
	public Student(String classId, String name, String studentId, int age, char sex) {
		super();
		this.classId = classId;
		this.name = name;
		this.studentId = studentId;
		this.age = age;
		this.sex = sex;
	}

	/**
	 * 班级ID
	 */
	private String classId;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 学号
	 */
	private String studentId;
	
	/**
	 * 年龄
	 */
	private int age;
	
	/**
	 * 性别
	 */
	private char sex;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [classId=" + classId + ", name=" + name + ", studentId=" + studentId + ", age=" + age + ", sex="
				+ sex + "]";
	}
}
