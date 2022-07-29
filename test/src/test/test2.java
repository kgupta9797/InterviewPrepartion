package test;

public class test2 {

	//int a = 5, d = 2;
//			5, 3, 1, -1, 1, 3, 5

	public static void main(String[] args) {
		int a = 5, d = 2;

		int i = 0;
		for (i = a; i > -1; i = i - d) {
			System.out.println(i);
		}
		for (; i <= a; i = i + d) {
			System.out.println(i);
		}
	}
}
