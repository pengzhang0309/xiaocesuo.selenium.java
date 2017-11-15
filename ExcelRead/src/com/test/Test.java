package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:/Java Courses/ExcelRead/files/test.xlsx");
		FileInputStream fis = null; 
		Workbook wb = null;
				 
		try
		{
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("login");
			//��������
			int rowCount = sheet.getLastRowNum() + 1;
			//ѭ����0��������
			for (int i = 0; i < rowCount; i++) 
			{
				//ȡ��ÿһ��
				Row row = sheet.getRow(i);
				
				//ȡ��ÿһ�е�ֵ
				for (int j = 0; j < row.getLastCellNum(); j++)
				{
					String value= row.getCell(j).getStringCellValue();
					System.out.print(value + " ");
				}
				System.out.println();
			}
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