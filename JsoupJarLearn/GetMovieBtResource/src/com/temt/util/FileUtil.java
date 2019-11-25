package com.temt.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 文件处理工具类
 * @author TEMT
 *
 */
public class FileUtil {

	/**
	 * 将text保存到targetPath路径的文件中
	 * @param targetPath
	 * @param text
	 * @return
	 */
    public static boolean writeFile(String targetPath,String fileName,String text){
    	
    	File targetFile = null;
    	File targetDir = null;
    	Writer writer = null;
    	try {
    		targetDir = new File(targetPath);
    		if(!targetDir.exists()){
    			targetDir.mkdirs();
    		}
    		targetFile = new File(targetPath + "\\" + fileName);
    		if(!targetFile.exists()){
    			targetFile.createNewFile();
    		}
    		writer = new BufferedWriter(new OutputStreamWriter(
							new FileOutputStream(targetFile,true), "gbk"));
    		writer.write(text);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(writer != null){
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
    }
}
