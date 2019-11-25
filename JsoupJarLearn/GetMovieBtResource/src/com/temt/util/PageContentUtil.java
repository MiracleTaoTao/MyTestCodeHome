package com.temt.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * ҳ�洦������
 * @author TEMT
 *
 */
public class PageContentUtil {
	
	/**
	 * ���ص�Ӱ��Դ
	 * @param rootUrl
	 * @param url
	 * @param targetPath
	 */
	public static void downloadBTResource(String rootUrl,String url,String targetPath,String fileName){
		try {
			Document doc = Jsoup.connect(url).get();
			//��ȡȫ��a��ǩ
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String movieTitle = link.attr("title");
				String movieHref = link.attr("href");
				//ֻҪmovieTitle�����ڿյ�
				if(movieTitle!=null && movieTitle!=""){
					System.out.println(movieTitle);
					FileUtil.writeFile(targetPath,fileName, movieTitle+":\n");//д���Ӱ����
					goToMoiveDetailPage(rootUrl + movieHref,targetPath,fileName);//��������
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��������ҳ
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
