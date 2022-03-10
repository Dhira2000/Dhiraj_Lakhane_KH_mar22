import java.util.*;
class Circle
{ public static void main(String[]args)
  {
    Scanner dh= new Scanner(System.in);
	System.out.println("Enter radius value =");
	float f=dh.nextFloat();
	final double pi=3.14;
	double area = (f*f)*pi;
	System.out.println("Area= "+area);
	}
}	
	