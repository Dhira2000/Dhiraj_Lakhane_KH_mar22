import java.util.*;
class Scan1
{
 public static void main(String args[])
  {
   Scanner dd = new Scanner(System.in);
   
   System.out.println("enter number ");
   int i= dd.nextInt();
   
   System.out.println("enter number= ");
   int j= dd.nextInt();
   
   int k = (i * j) + (j % i) * (i % j);
   System.out.print("Result is= "+((k == i) ? true:false));
   }
 }  