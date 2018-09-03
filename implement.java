import java.util.*;
interface Animals {
    void speak();
    void eat();	
}
 class Dog implements Animals{
	public void speak() {
		System.out.println("bark");
	}
	public void eat() {
		System.out.println("eat bones");
	}
 }
 class cat implements Animals{
		public void speak() {
			System.out.println("meow");
		}
		public void eat() {
			System.out.println("eat veggies");
		}
	 }

class implem{
 public static void main(String[] args) {
      Animals d=new Dog();
      d.speak();
      d.eat();
      d=new cat();
System.out.println("\n---------\n");
      d.speak();
      d.eat();
}
}