class Asg
{
	public static void main(String args[])
	{
		System.out.println("          *");
		for (int l=1; l<=2; l++)
		{
			for(int i=2; i<=6; i++)
			{
				for(int k=i; k<6; k++)
					System.out.print("  ");
				for(int j=1; j<=i; j++)
					System.out.print("* ");
				System.out.println();
			}
			for(int i=1; i<6; i++)
			{
				for(int k=(6-i); k<6; k++)
					System.out.print("  ");
				for(int j=5; j>=i; j--)
					System.out.print("* ");
				System.out.println();
			}
		}
	}
}