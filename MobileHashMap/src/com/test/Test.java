package com.test;
import java.util.HashMap;
import java.util.Iterator;

public class Test 
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		hm.put("name", "iphone X");
		hm.put("size", 6.6f);
		hm.put("price", 100);
		
		/*System.out.println(hm.get("name"));
		System.out.println(hm.get("size"));
		System.out.println(hm.get("price"));*/
		
		//System.out.println(hm);
		
		Iterator iterator = hm.keySet().iterator();
		String key;
		String value;
		
		while(iterator.hasNext())
		{
			key = iterator.next().toString();
			System.out.println(hm.get(key));
		}
	}

}
