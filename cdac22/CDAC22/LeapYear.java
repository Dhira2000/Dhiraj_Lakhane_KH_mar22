import java.util.*;
class LeapYear
{ public static void main(String[]args)
  { Scanner dh= new Scanner(System.in);
    System.out.println("Enter year");
	int i= dh.nextInt();
	
	if((i % 400==0)||(i % 4 == 0) && (i % 100 != 0))
	   System.out.println("LeapYear");
	else
      System.out.println("Non Leap Year");
    }
}	