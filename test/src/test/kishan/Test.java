package test.kishan;

public class Test {

	private static int counter =0;
	void Test() //this is not constructor this is method method have return type+ank
	{
		counter=20;
	}
	Test(int x)
	{
		counter=x;
	}
	public static void main(String[] args) {
//Test test = new Test();// default construcro is need
System.out.println(counter);
	}

}
