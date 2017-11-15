package com.test;

class Computer
{
    String brand;
	float price;
	
	public Computer(String brand, float price)
	{
		this.brand = brand;
		this.price = price;
	}
	
	
}

class TypeBag<T>
{
	private T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		Computer asus = new Computer("��˶", 500);
		Computer dell = new Computer("����", 600);
		Computer mac = new Computer("Mac", 700);
		
		// TypeBag��������Computer��ı�ǩ�������Ͼ���Computer��
		TypeBag<Computer> t1 = new TypeBag<Computer>();
		t1.setType(asus);
		TypeBag<Computer> t2 = new TypeBag<Computer>();
		t2.setType(dell);
		TypeBag<Computer> t3 = new TypeBag<Computer>();
		t3.setType(mac);
		
		System.out.println("С��������ࣺ");
		System.out.println("===========");
		System.out.println(t1.getType().brand + ", " + t1.getType().price);
		System.out.println(t2.getType().brand + ", " + t2.getType().price);
		System.out.println(t3.getType().brand + ", " + t3.getType().price);
	}
}
