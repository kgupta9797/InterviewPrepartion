package test.kishan;

//public class LeapYear {
//	public static void main(String[] args) {
//		int year=2001;
//		boolean res;
//		res=(year % 100!= 0);
//		System.out.println(res);
//	}
//
//}

//400,16,100,17
import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
   }
}
 //1997,1998,1999,2000,2001,1616

//}