import java.util.Scanner;
class complex{
int real,imag;
int Display(int r,int i)
{
real=r;
imag=i;
System.out.println(real+"+"+imag+"i");
return 0;
}
}
class mainclass{
public static void main(String[] args)
{
Scanner s=new Scanner (System.in);
int a=s.nextInt();
int b=s.nextInt();
complex r=new complex();
r.Display(a,b);
}
}