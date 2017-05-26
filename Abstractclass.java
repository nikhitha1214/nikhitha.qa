package core;



abstract class  A
{
	A()
	{ 
		System.out.println("parent cls cnstrctr");
		}
	abstract void m1();
}
public class Abstractclass extends A{
	

	
		Abstractclass()
		{
				
				System.out.println("normal cls cnstrctr");}
		void m1()
		{
		System.out.println("m1 method");
		}

		public static void main(String[] args) 
		{
			new Abstractclass().m1();
		}
	}


