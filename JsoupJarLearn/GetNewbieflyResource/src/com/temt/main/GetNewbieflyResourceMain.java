package com.temt.main;

import com.temt.util.PageContentUtil;

public class GetNewbieflyResourceMain {

	public static void main(String[] args) {
		getList();
	}

	public static void getList(){
		for(int i = 1 ; i <= 61 ; i++){
			PageContentUtil.downloadNewbieflyList("http://www.newbiefly.com/?paged="+i, 
					"D:\\gitWorkspace\\MyTestCodeHome\\JsoupJarLearn\\GetNewbieflyResource\\download", 
					"newbiefly.txt");
		}		
	}
}
