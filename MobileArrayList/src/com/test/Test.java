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
		
		//添加元素
		al.add(name);
		al.add(size);
		al.add(price);
		
		/*
		System.out.println("手机名称：" + al.get(0));
		System.out.println("尺寸：" + al.get(1));
		System.out.println("价格：" + al.get(2));*/
		
		//删除元素
		//al.remove(2);
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}	
	}
}
