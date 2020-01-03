## Java 8 Stream练习

### 分组功能

- [groupingBy](https://github.com/MiracleTaoTao/MyTestCodeHome/blob/master/Java8Stream/StreamTest/src/com/temt/test/GroupTest.java)

```java
		Map<String, List<Student>> collect = stuList.stream().collect(Collectors.groupingBy(Student::getClassId));
		for(Map.Entry<String, List<Student>> stuMap:collect.entrySet()){
			String classId = stuMap.getKey();
			List<Student> studentList = stuMap.getValue();
			
			System.out.println("classId:"+classId+",studentList:"+studentList.toString());
		}
```

