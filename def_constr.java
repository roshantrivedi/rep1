import java.util.*;
class A
{  
  A(){ 
       System.out.println("Default Contructor");
      }  

  A(int x){  
this();  
System.out.println(x);  
}  
}

class deconstr{  
    public static void main(String[] args){  
     A a=new A(20);  
}
}