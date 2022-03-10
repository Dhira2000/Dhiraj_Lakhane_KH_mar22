import java.util.*;
class Armstrong {
    public static void main(String[]args) {
	Scanner dh = new Scanner(System.in);
	int i = dh.nextInt();
	int temp = i;
	int res;
	int sum = 0;
	while(i>0) {
	res = i % 10;
	sum = sum + (res*res*res);
	i = i/10; }
	if(temp==sum)
	System.out.println("Armstrong number");
	else
	System.out.println(" Not an Armstrong number");
	}
}	
	
	
