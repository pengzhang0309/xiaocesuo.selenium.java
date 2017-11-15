package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test 
{
	public static void main(String[] args) throws IOException 
	{
		File f_old = new File("D:/Java Courses/FileByteWrite/files/picByte.jpg");
		File f_new = new File("D:/Java Courses/FileByteWrite/files/picByte1.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try 
		{
			fis = new FileInputStream(f_old);
			fos = new FileOutputStream(f_new);
			
			int n = 0;
			byte b[] = new byte[200];
			n = fis.read(b);
			
			while(n != -1)
			{
				//String line = new String(b, 0, n);
				fos.write(b, 0, n);
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
			fos.close();
		}
		
	}

}
