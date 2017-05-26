package core;

public class Parent {
	
	public void p(){
		System.out.println("i am parent method");
	}
}

class Child extends Parent{
	
	public void c(){
		p();
		System.out.println("i am child method");
	}

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.c();
	}

}
