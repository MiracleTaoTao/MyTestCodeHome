package com.temt.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 将字符串用某种符号进行拼接
 * @author 10364
 *
 */
public class AppendString {

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

	public static String method1(List<String> list){
		return String.join(",", list);
	}
	
	public static String method2(List<String> list){
		return list.stream().collect(Collectors.joining(","));
	}
	
	public static String method3(List<String> list){
		return list.stream().reduce((a,b)->a + "," + b).get();
	}
}
