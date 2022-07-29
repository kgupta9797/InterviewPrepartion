package test;

public class test {
	public static void main(String[] args) {
		int a = 5, d = 2;
		int res = a - d; //3
		
		System.out.println(a);
		System.out.println(res);
		while (res > 0) {
			res = res - 2;
			System.out.println(res); //-1
		}
		res=res+2;
		System.out.println(res);//1
		
//		while(res>a)  
//		res = res + d;
//		System.out.println("-->"+res);
//		res=res+d;
//		System.out.println(res);
//		res=res+d;
//		System.out.println(res);
//
		
//		System.out.println("res" + res);
//		while (a > 0)
//			// {
//			res = res + d;
//		System.out.println(res);
//		// }
	}

//	a = 5, d = 2
//			5, 3, 1, -1, 1, 3, 5

}
