package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:/Java Courses/FileByteRead/files/picByte.jpg");
		FileInputStream fis = null;
		
		try 
		{
			fis = new FileInputStream(f);
			
			byte[] b = new byte[200];
			
			int n = 0;
			n = fis.read(b);
			while(n != -1)
			{
				String line = new String(b, 0, n);
				System.out.print(line);
				n = fis.read(b);
			}			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			fis.close();
		}
		
	}

}
