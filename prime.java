import java.util.Scanner;
class primeno{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter number to check prime");	
	int num=s.nextInt();
	int i,temp=0;
	for(i=2;i<=num/2;i++)
	{
		if(num%i==0){
			temp=1;
			break;
		}
	}
		if(temp!=1)
			System.out.println("number is prime");
		else
			System.out.println("number is not a prime");
	
	
}
}