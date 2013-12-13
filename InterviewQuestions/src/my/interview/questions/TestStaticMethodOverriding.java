package my.interview.questions;

public class TestStaticMethodOverriding {
	
	
	public static void main(String args[]){
		SuperClass  superClass = new SuperClass();
		Subclass subclass = new Subclass();
		SuperClass superClass2 = new Subclass();
		
		superClass.foo();
		subclass.foo();
		superClass2.foo();
		
	}

}

class SuperClass {
	
	public static void foo(){
		System.out.println("SuperClass.foo()");
	}
}


class Subclass extends SuperClass{
	
	public static void foo(){
		System.out.println("Subclass.foo()");
		
	}
}