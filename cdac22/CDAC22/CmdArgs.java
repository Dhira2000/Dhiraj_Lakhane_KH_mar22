class CmdArgs
{
 public static void main(String args[])
  {
    String s1 = args[0];
	String s2 = args[1];
	String s3 = args[2];
	
	int i= Integer.parseInt(s1);
	float f=Float.parseFloat(s2);
	double d=Double.parseDouble(s3);
	
	System.out.println(" i= "+args[0]);
	System.out.println(" f= "+args[1]);
	System.out.println(" d= "+args[2]);
	System.out.println(" sum= "+(i+f+d));
   }
}   