import java.util.*;
// Class which can't be extended further
final class A{  
 void show(){
 System.out.println("Class A");
}                                       
}            
class B extends A         // will show error
{               
 void show(){
 System.out.println("Class B");
}                                       
}
class mainclass{
public static void main(String args[]){  
B obj= new B(); 
obj.show();
}
}
