## 字符串拼接符号

> 经常在项目中看到有人用循环的方式拼接符号，拼接完成之后又去掉最后一个字符，太过麻烦。因此找了下面三种简单易懂的方式来解决这个问题。

- 常规方法
- 方法一

```java
	public static String method1(List<String> list){
		return String.join(",", list);
	}
```

- 方法二

```java
	public static String method2(List<String> list){
		return list.stream().collect(Collectors.joining(","));
	}
```

- 方法三

```java
	public static String method3(List<String> list){
		return list.stream().reduce((a,b)->a + "," + b).get();
	}
```

- 测试

```java
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("甄姬");
		list.add("鲁班");
		list.add("程咬金");
		list.add("李白");
		list.add("刘禅");
		
		System.out.println("方法一：" + method1(list));//方法一：甄姬,鲁班,程咬金,李白,刘禅
		System.out.println("方法二：" + method2(list));//方法二：甄姬,鲁班,程咬金,李白,刘禅
		System.out.println("方法三：" + method3(list));//方法三：甄姬,鲁班,程咬金,李白,刘禅
	}
```

