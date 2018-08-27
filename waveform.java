import java.util.Scanner;
class waveform { 
public static void main(String[] args) 
{	Scanner s=new Scanner (System.in);
	int[] myarr =new int[10];
	int temp;
		
System.out.println("input 10 elements: " );
for(int i=0;i<10;i++){
	myarr[i]=s.nextInt();
}

	for (int i=0;i<10;i=i+2) {
		temp=myarr[i];
		myarr[i]=myarr[i+1];
		myarr[i+1]=temp;
		}
		System.out.println("array after waveform: ");	
	for(int j=0;j<10;j++){
System.out.print(myarr[j]);
	}
}
}