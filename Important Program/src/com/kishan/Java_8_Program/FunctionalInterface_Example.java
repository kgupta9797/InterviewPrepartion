package com.kishan.Java_8_Program;
@FunctionalInterface
interface showable
{
	public void show();
	}

public class FunctionalInterface_Example {
public static void main(String args[])
{
	showable ob = ()->System.out.println("Hello");
	ob.show();
	}
}
