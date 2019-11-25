package com.temt.main;

import com.temt.util.PageContentUtil;

/*
 * 获取电影种子
 */
public class GetMovieBtResourceMain {

	public static void main(String[] args) {
		//下载第67页的种子
		PageContentUtil.downloadBTResource("http://www.youzhidy.com",
				"http://www.youzhidy.com/gqdy/list_67.html",
				"D:\\download","list_67.txt");
	}

}
