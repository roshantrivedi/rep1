import java.util.Scanner;
class secondlargest { 
public static void main(String[] args) 
{	Scanner s=new Scanner (System.in);
	int[] myarr =new int[10];
	int largest =myarr[0];
	int secondLargest =myarr[0];
	int x;
		
System.out.println("input 10 elements: " );
	for (int i=0;i<10;i++) {
		myarr[i]=s.nextInt();
		}
	for (int j=0; j<10;j++)
		{
			if (myarr[j] >largest) {
				secondLargest = largest;
				largest = myarr[j]; 
			} else if (myarr[j] > secondLargest) {
				secondLargest = myarr[j];
			}
		}
System.out.println("second largest element: "+ secondLargest);
}
}