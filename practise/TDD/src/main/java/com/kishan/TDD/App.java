package com.kishan.TDD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public boolean isleap(int year) {
		if(year%400==0||year%4==0&&year%100!=0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	public boolean stringChck(String string) {
		if(string.length()==0||!string.matches("[0-9]{4}"))
		{
			return false;
		}
		
		int year=Integer.parseInt(string);
		if(year%400==0||year%4==0&&year%100!=0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
}
