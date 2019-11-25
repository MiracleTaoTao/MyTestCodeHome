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
	
	/**
	 * 下载电影资源
	 * @param rootUrl
	 * @param url
	 * @param targetPath
	 */
	public static void downloadBTResource(String rootUrl,String url,String targetPath,String fileName){
		try {
			Document doc = Jsoup.connect(url).get();
			//获取全部a标签
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String movieTitle = link.attr("title");
				String movieHref = link.attr("href");
				//只要movieTitle不等于空的
				if(movieTitle!=null && movieTitle!=""){
					System.out.println(movieTitle);
					FileUtil.writeFile(targetPath,fileName, movieTitle+":\n");//写入电影标题
					goToMoiveDetailPage(rootUrl + movieHref,targetPath,fileName);//真正进入
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 进入详情页
	 * @param url
	 * @param targetPath
	 */
	public static void goToMoiveDetailPage(String url,String targetPath,String fileName){
		try {
			Document doc = Jsoup.connect(url).get();
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String movieHref = link.attr("href");
				if(movieHref !=null && (movieHref.startsWith("magnet")||
						movieHref.startsWith("ed2k")||movieHref.startsWith("thunder"))){
					System.out.println(movieHref);
					FileUtil.writeFile(targetPath,fileName,movieHref+"\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
