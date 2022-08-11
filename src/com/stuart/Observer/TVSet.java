package com.stuart.Observer;

public class TVSet implements ElectricityListener
{

	@Override
	public void electricityOn(Object source)
	{
		System.out.println("��������� ���������");
		
	}

}
