package com.test;

import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		String name = "iphone";
		float size = 6.6f;
		int price = 100;
		
		//���Ԫ��
		al.add(name);
		al.add(size);
		al.add(price);
		
		/*
		System.out.println("�ֻ����ƣ�" + al.get(0));
		System.out.println("�ߴ磺" + al.get(1));
		System.out.println("�۸�" + al.get(2));*/
		
		//ɾ��Ԫ��
		//al.remove(2);
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}	
	}
}
