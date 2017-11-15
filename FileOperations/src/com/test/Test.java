package com.test;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:/Java Courses/FileOperations/files/test.txt");
		System.out.println("�ļ�����" + f.getName()); //�õ��ļ���
		System.out.println("�ļ�·����" + f.getAbsolutePath()); //�õ��ļ��ľ���·��
		System.out.println("�ļ���С��" + f.length()); //�õ��ļ���С
		System.out.println("�ļ��Ƿ���ڣ�" + f.exists()); //�ж��ļ��Ƿ����
		f.delete(); //ɾ���ļ�
		
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
