import java.util.Scanner;
class biggestno{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter 3 numbers:");	
	int x=s.nextInt();
	int y=s.nextInt();
	int z=s.nextInt();
	if(x>y&&x>z)
		System.out.println("x is greatest "+x);
	else if(y>x&&y>z)
		System.out.println("y is greatest "+y);
	else
	    System.out.println("z is greatest "+z);	
	
}
}