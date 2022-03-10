import java.util.*;
class Grades
{ public static void main(String[]args)

 { Scanner dh= new Scanner(System.in);
   System.out.println("Enter marks ");
   int i= dh.nextInt();
   if( i < 50)
   {   
	   System.out.println("fail");
   }
    else if(i>=50 && i< 60)
    { System.out.println("D grade");}
	else if( i>=60 && i< 70)
	{System.out.println("c grade");}
	else if ( i>= 70 && i< 80)
	 {System.out.println("B grade");}
	
	else if( i>= 80 && i< 90)
	{System.out.println("A grade");}

    else if(i>= 90 && i<100)
	{System.out.println("A+ grade");}
			

 }
   
 }	 