package com.temt.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ���ַ�����ĳ�ַ��Ž���ƴ��
 * @author 10364
 *
 */
public class AppendString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("�缧");
		list.add("³��");
		list.add("��ҧ��");
		list.add("���");
		list.add("����");
		
		System.out.println("����һ��" + method1(list));//����һ���缧,³��,��ҧ��,���,����
		System.out.println("��������" + method2(list));//���������缧,³��,��ҧ��,���,����
		System.out.println("��������" + method3(list));//���������缧,³��,��ҧ��,���,����
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
