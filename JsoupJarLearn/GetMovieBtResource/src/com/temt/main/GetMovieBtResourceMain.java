package com.temt.main;

import com.temt.util.PageContentUtil;

/*
 * ��ȡ��Ӱ����
 */
public class GetMovieBtResourceMain {

	public static void main(String[] args) {
		//���ص�67ҳ������
		PageContentUtil.downloadBTResource("http://www.youzhidy.com",
				"http://www.youzhidy.com/gqdy/list_67.html",
				"D:\\download","list_67.txt");
	}

}
