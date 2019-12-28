package com.temt.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.temt.bean.Student;

public class GroupTest {

	public static void main(String[] args) {

		testStreamGroup();
	}
	
	public static void testStreamGroup(){
		List<Student> stuList = new ArrayList<Student>();
		Student stu1 = new Student("10001", "ËïÈ¨", "1000101", 16, 'ÄĞ');
		Student stu2 = new Student("10001", "²Ü²Ù", "1000102", 16, 'ÄĞ');
		Student stu3 = new Student("10002", "Áõ±¸", "1000201", 16, 'ÄĞ');
		Student stu4 = new Student("10002", "´óÇÇ", "1000202", 16, 'Å®');
		Student stu5 = new Student("10002", "Ğ¡ÇÇ", "1000203", 16, 'Å®');
		Student stu6 = new Student("10003", "Öî¸ğÁÁ", "1000301", 16, 'ÄĞ');
		
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu4);
		stuList.add(stu5);
		stuList.add(stu6);
		
		Map<String, List<Student>> collect = stuList.stream().collect(Collectors.groupingBy(Student::getClassId));
		for(Map.Entry<String, List<Student>> stuMap:collect.entrySet()){
			String classId = stuMap.getKey();
			List<Student> studentList = stuMap.getValue();
			
			System.out.println("classId:"+classId+",studentList:"+studentList.toString());
		}
	}

}
