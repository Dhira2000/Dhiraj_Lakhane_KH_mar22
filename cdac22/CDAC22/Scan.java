import java.util.*;
class Scan
{ 
  public static void main(String args[])
  {
   Scanner dh = new Scanner(System.in);
   
   System.out.println("Enter number1 = ");
   int n1 = dh.nextInt();
   
   System.out.println("Enter number2 = ");
   int n2 = dh.nextInt();
   
   int k = ++n1 % n2++;
   long l=k;
   float f=(float)l;
   System.out.println("display result= "+f);
   
   System.out.println("Value of k= "+k);
   System.out.println("Value of l = "+l);
   
   }
 }  
  