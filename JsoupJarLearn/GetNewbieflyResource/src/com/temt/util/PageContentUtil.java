package com.temt.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 页面处理工具类
 * @author TEMT
 *
 */
public class PageContentUtil {
	
	public static void downloadNewbieflyList(String url,String targetPath,String fileName){
		try {
			System.out.println(url);
			Document doc = Jsoup.connect(url).get();
			Elements articleSec = doc.select("article");
			for(Element article:articleSec){
				String time = article.select("time").text();
				String text = article.select("h3").text();
				String result = time+"_"+text;
				System.out.println(result);
				FileUtil.writeFile(targetPath,fileName,result+"\n");
			}
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
