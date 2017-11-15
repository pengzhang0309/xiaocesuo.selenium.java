package com.test;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:/Java Courses/FileOperations/files/test.txt");
		System.out.println("文件名：" + f.getName()); //得到文件名
		System.out.println("文件路径：" + f.getAbsolutePath()); //得到文件的绝对路径
		System.out.println("文件大小：" + f.length()); //得到文件大小
		System.out.println("文件是否存在：" + f.exists()); //判断文件是否存在
		f.delete(); //删除文件
		
		if(!f.exists())
		{
			f.createNewFile(); 
		}
		
		File folder = new File("D:/Java Courses/FileOperations/files");
		if(folder.isDirectory())
		{
			File[] fileList = folder.listFiles();
			for(int i = 0; i < fileList.length; i++)
			{
				System.out.println(fileList[i]);
			}
		}
	}

}
