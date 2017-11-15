package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:/Java Courses/ExcelWrite/files/test.xlsx");
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		Workbook wb = null;
		String[] str = {"1004", "101112"};
				 
		try
		{
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("login");

			//����һ��
			Row row = sheet.createRow(0);
				
			//��ֵ�ӵ�ÿ����
			for (int j = 0; j < 2; j++)
			{
				Cell cell = row.createCell(j);
				cell.setCellValue(str[j]);
			}
			
			//��ʼ�������
			fos = new FileOutputStream(f);
			//������д���ļ���
			wb.write(fos);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			wb.close();
			fis.close();
		}		
	}
}