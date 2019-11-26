package com.temt.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * �ļ���������
 * @author TEMT
 *
 */
public class FileUtil {

	/**
	 * ��text���浽targetPath·�����ļ���
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
