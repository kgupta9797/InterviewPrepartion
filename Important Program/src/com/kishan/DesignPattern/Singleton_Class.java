package com.kishan.DesignPattern;

public class Singleton_Class {
	public static void main(String[] args) {
		Abc ob = Abc.getInstance();
		Abc ob2 = Abc.getInstance();
	}

}

class Abc {
	static Abc obj = new Abc();

	private Abc() {
		System.out.println("Only one instance");
		// construtor should be private
	}

	public static Abc getInstance() {
		return obj;
	}
}