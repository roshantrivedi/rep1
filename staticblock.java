// static block
// executed only once in entire program
class test{
int r;
static int count;
static{
	count=1;
	System.out.println("in static 1");
}
static {
	count=2;
	System.out.println("in static 2"+" "+count);	
}
test(){
	count=4;
	System.out.println("in constructor"+count);	
}	
{
	count=3;
System.out.println("in non-static"+ count);
}
}
class mainclass {
	static{
		System.out.println("inside static main");	
	}
	public static void main(String[] args)
	{   test t=new test();
		test t2=new test();
		System.out.println("inside main function");	
		System.out.println(t2.count);
	}
}
