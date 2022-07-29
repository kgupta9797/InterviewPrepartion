package com.kishan.BasicProgram;

public class GenerateFibbnacciSeries {

	public static void main(String[] args) {
		int n = 7;
		int a = 0, b = 1;
		int c;
		for (int i = 1; i <= n; i++) {
			System.out.print(a); // {0,1}

			c = a + b;
			a = b;
			b = c;
		}

	}

}
