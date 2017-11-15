package com.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test 
{
	public static void main(String[] args) throws IOException 
	{
		File f_old = new File("D:/Java Courses/FileCharBuffer/files/test.txt");
		File f_new = new File("D:/Java Courses/FileCharBuffer/files/test1.txt");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
	
		try 
		{
			fr = new FileReader(f_old);
			fw = new FileWriter(f_new);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line = br.readLine();
			
			while(line != null)
			{
				bw.write(line + "\n");
				line = br.readLine();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			br.close();
			bw.close();
			fr.close();
			fw.close();
		}
	}
}
